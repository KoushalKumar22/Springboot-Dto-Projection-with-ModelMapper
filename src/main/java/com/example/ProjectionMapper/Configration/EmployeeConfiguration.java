package com.example.ProjectionMapper.Configration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfiguration {

    @Bean
    ModelMapper mymodel()
    {
        return new ModelMapper();
    }
}
