package com.zipkin.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/**
 * 
 * @author Prasanth.P
 *
 */
@SpringBootApplication
@EnableZipkinServer
public class App 
{
    public static void main( String[] args )
    {
      SpringApplication.run(App.class, args);
    }
}
