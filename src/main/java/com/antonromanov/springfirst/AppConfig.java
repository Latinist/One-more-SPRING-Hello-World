package com.antonromanov.springfirst;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author imssbora
 */
@Configuration
public class AppConfig {
	
	@Bean(name="myBean")
	public HelloWorld getHelloWorld(){
		return new HelloWorld();
	}	
	

}
