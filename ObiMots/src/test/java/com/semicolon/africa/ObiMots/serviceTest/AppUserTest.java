package com.semicolon.africa.ObiMots.serviceTest;

import com.semicolon.africa.ObiMots.dtos.request.RegisterRequest;
import com.semicolon.africa.ObiMots.dtos.response.RegisterResponse;
import com.semicolon.africa.ObiMots.exceptions.InvalidEmailAndPasswordException;
import com.semicolon.africa.ObiMots.exceptions.ThisEmailAlreadyExistException;
import com.semicolon.africa.ObiMots.repositories.AppUserRepository;
import com.semicolon.africa.ObiMots.services.AppUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AppUserTest {

    @Autowired
    private AppUserService appUserService;
    @Autowired
    private AppUserRepository appUserRepository;

    @Test
    public void testToRegister() {
        RegisterRequest request = getRegisterRequest();
        RegisterResponse response = appUserService.register(request);
        assertNotNull(response);
        assertEquals("Successfully registered", response.getMessage());
        assertEquals(1, appUserRepository.findAll().size());
    }

    private RegisterRequest getRegisterRequest() {
        RegisterRequest request = new RegisterRequest();
        request.setEmail("test@example.com");
        request.setPassword("12345");
        request.setName("test");
        request.setPhoneNumber("08012345678");
//        appUserService.register(request);
        return request;
    }

    @Test
    public void testThatSameEmailCanNotBeRegisteredTwice(){
        RegisterRequest request = getRegisterRequest();
        assertThrows(ThisEmailAlreadyExistException.class, ()-> appUserService.register(request));
    }

}
