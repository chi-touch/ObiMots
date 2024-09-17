package com.semicolon.africa.ObiMots.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookingRequest {
    private CustomerPickUpAddressRequest pickUpAddress;
    private CustomerDestinationRequest destination;
}
