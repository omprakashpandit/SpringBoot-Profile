package com.pak.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = {"dev","stg","prod"})
public class ProfileConfig {
	 @Value("${application.message}")
	    private String message;

	    @PostConstruct
	    public void init(){
	        System.out.println("************* "+message+"*************");
	    }
}
