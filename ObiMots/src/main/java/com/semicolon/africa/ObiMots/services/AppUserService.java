package com.semicolon.africa.ObiMots.services;

import com.semicolon.africa.ObiMots.dtos.request.RegisterRequest;
import com.semicolon.africa.ObiMots.dtos.response.RegisterResponse;
import com.semicolon.africa.ObiMots.exceptions.InvalidEmailAndPasswordException;

public interface AppUserService {

    RegisterResponse register(RegisterRequest registerRequest);
}

