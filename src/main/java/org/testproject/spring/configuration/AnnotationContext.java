package org.testproject.spring.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AnnotationContext 
{
    public static void printMsg()
    {/*
         * The first step is to create an application context where we used framework API 
         * ClassPathXmlApplicationContext(). 
         * This API loads beans configuration file and eventually based on the provided API,
         * it takes care of creating and initializing all the objects, 
         * i.e. beans mentioned in the configuration file.
         * 
         * The second step is used to get the required bean using getBean()
		 * method of the created context. 
		 * This method uses bean ID to return a generic object, 
		 * which finally can be casted to the actual object.
		 * Once you have an object, 
		 * you can use this object to call any class method
		 * 
		 * The objects that form the backbone of your application
		 * and that are managed by the Spring IoC container are called beans.
         */
    	
    	 ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
    	   
    	   HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
    	   helloWorld.setMessage("Hello World!");
    	   helloWorld.getMessage();
    	   
    	   
      	 ApplicationContext ctx1 = new AnnotationConfigApplicationContext(ConfigA2.class);
    	   // now both beans Foo and Bar will be available...
    	   Foo a = ctx1.getBean(Foo.class);
    	   Bar b = ctx1.getBean(Bar.class);
    }
}

