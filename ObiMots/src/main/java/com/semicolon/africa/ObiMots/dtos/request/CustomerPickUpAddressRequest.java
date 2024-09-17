package com.semicolon.africa.ObiMots.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerPickUpAddressRequest {
    private String location;
    private String state;

}
