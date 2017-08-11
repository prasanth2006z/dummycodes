package com.spring.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class UserDetailsConfiguration{

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		// Data source for Oauth
		auth.inMemoryAuthentication().withUser("bill").password("abc123").roles("USER")
				.and().withUser("myuser").password("mypassword").roles("USER")
				.and().withUser("test").password("testpassword").roles("USER");
	}

}