package com.eureka.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 
 * @author Prasanth.P
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulServerApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ZuulServerApp.class).web(true).run(args);
	}
}
