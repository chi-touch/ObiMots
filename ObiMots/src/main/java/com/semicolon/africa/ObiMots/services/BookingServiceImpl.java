//package com.semicolon.africa.ObiMots.services;
//
//import com.semicolon.africa.ObiMots.dtos.request.BookingRequest;
//import com.semicolon.africa.ObiMots.model.Booking;
//import com.semicolon.africa.ObiMots.repositories.BookingRepository;
//import lombok.RequiredArgsConstructor;
//import org.modelmapper.ModelMapper;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//
//@Service
//@RequiredArgsConstructor
//public class BookingServiceImpl implements BookingService {
//
//    private final ModelMapper modelMapper;
//    private final BookingRepository bookRepository;
//    public String bookTravel(BookingRequest bookingRequest) {
//        Booking booking = new Booking();
//
//        booking.setPickUpLocation(bookingRequest.getPickUpAddress().getLocation());
//        booking.setPickUpState(bookingRequest.getPickUpAddress().getState());
//        booking.setDestinationState(bookingRequest.getDestination().getState());
//        booking.setBookingTime(LocalDateTime.now());
//        booking.setScheduledTime(LocalDateTime.from(s));
//        booking.setUser(bookingRequest.getUser());
//
//        bookingRepository.save(booking);
//
//        // Return a confirmation message
//        return "Booking confirmed! Pick-up at " + booking.getPickUpLocation() + ", " + booking.getPickUpState()
//                + " with destination in " + booking.getDestinationState();
//    }
//
//
//
//
//}
