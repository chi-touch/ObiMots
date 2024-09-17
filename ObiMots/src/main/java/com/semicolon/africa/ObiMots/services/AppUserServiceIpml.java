package com.semicolon.africa.ObiMots.services;

import com.semicolon.africa.ObiMots.dtos.request.RegisterRequest;
import com.semicolon.africa.ObiMots.dtos.response.RegisterResponse;
import com.semicolon.africa.ObiMots.exceptions.IllegalInputException;
import com.semicolon.africa.ObiMots.exceptions.InvalidEmailAndPasswordException;
import com.semicolon.africa.ObiMots.exceptions.ThisEmailAlreadyExistException;
import com.semicolon.africa.ObiMots.model.AppUsers;
import com.semicolon.africa.ObiMots.repositories.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppUserServiceIpml implements AppUserService{

    private final ModelMapper modelMapper;

    private final AppUserRepository appUserRepository;
    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
        if (registerRequest.getEmail().isEmpty() || registerRequest.getPassword().isEmpty()){
            throw new IllegalInputException("you can not register with an empty space");
        }
        if (!validateUser(registerRequest.getEmail())) throw new ThisEmailAlreadyExistException("This user already exist enter another email");

        AppUsers user = modelMapper.map(registerRequest, AppUsers.class);
        appUserRepository.save(user);
        RegisterResponse response = modelMapper.map(user,RegisterResponse.class);
        response.setMessage("Successfully registered");

        return response;
    }

    private AppUsers findUserByEmail(String email) {
        AppUsers user = appUserRepository.findAppUserByEmail(email);
        if (user == null) throw new RuntimeException(email + " does not exist");
        return user;
    }

    private boolean validateUser(String email){
        var user = appUserRepository.findAppUserByEmail(email);
        return user == null;
    }
}
