package com.example.ProjectionMapper.Configration;

import org.hibernate.query.NativeQuery;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfigration {

    @Bean
    ModelMapper mymodel()
    {
        return new ModelMapper();
    }
}
