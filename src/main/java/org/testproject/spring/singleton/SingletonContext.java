package org.testproject.spring.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.testproject.spring.basic.HelloWorld;

/**
 * Hello world!
 *
 */
public class SingletonContext 
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
    	
    	 ApplicationContext contextSingleton = new ClassPathXmlApplicationContext("Beans.xml");
         HelloWorldSingleton objSA = (HelloWorldSingleton) contextSingleton.getBean("helloWorldSingleton");

         objSA.setMessage("I'm object A");
         objSA.getMessage();
    }
}

