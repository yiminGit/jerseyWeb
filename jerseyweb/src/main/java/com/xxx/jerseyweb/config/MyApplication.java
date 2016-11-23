package com.xxx.jerseyweb.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class MyApplication extends ResourceConfig {
	
	public MyApplication(){
		System.out.println("Run MyApplication");
        packages("com.xxx.jerseyweb.rest");
    }

}
