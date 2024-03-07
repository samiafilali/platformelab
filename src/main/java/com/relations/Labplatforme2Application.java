package com.relations;

import org.modelmapper.ModelMapper;  
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Labplatforme2Application {

    public static void main(String[] args) {
        SpringApplication.run(Labplatforme2Application.class, args);
    }
 @Bean
    public ModelMapper modelmapper()
    {
    return new ModelMapper();
    }
}

