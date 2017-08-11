package com.resource.server.controller;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableResourceServer
public class MyController {

	
	@PreAuthorize("#oauth2.hasScope('read')")
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String securedCall(Principal user) {
		return new String("test");
	}
}
