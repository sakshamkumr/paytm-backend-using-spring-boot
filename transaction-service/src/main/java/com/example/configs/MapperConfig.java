package com.example.configs;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.parser.JSONParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public JSONParser getParser(){
        return new JSONParser();
    }


    @Bean
    public ObjectMapper getMapper(){
        return new ObjectMapper();
    }
}
