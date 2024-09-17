package com.semicolon.africa.ObiMots.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterRequest {
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
}
