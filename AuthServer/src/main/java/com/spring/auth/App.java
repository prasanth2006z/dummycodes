package com.spring.auth;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@RestController
@EnableAuthorizationServer
@EnableResourceServer
@EnableAutoConfiguration
public class App  extends WebMvcConfigurerAdapter{
	
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
    @RequestMapping("/user")
    @ResponseBody
	public Principal user(Principal user) {
		return user;
	}
}
