package com.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author  Prasanth.P
 *
 */
@RestController
public class UserController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Map<String,String> read() {
		Map<String, String> map=new HashMap<>();
		map.put("test", "test");
		return map;
	}

}
