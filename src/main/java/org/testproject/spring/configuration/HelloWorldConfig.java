package org.testproject.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig{

	  @Bean 
	   public HelloWorld helloWorld(){
	      return new HelloWorld();
	   }
	  
	  /*
	   * 
	   * the same if in XML
	   *    <bean id = "helloWorld" class = "classpathto.HelloWorld" />

	   */
}