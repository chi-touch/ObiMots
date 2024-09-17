package com.semicolon.africa.ObiMots.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppMapper {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }


//    @Bean
//    public ModelMapper modelMapper(){
//        return modelMapper();
//    }
}
