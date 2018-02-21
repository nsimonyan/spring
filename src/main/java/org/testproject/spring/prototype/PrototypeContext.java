package org.testproject.spring.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class PrototypeContext 
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
    	
        ApplicationContext contextPrototype = new FileSystemXmlApplicationContext("C:\\Users\\Admin\\eclipse-workspace\\spring\\src\\main\\resources\\Beans.xml");
        HelloWorldPrototype objPA = (HelloWorldPrototype) contextPrototype.getBean("helloWorldPrototype");
        objPA.setMessage("I'm object A");
        objPA.getMessage();
        HelloWorldPrototype objPB = (HelloWorldPrototype) contextPrototype.getBean("helloWorldPrototype");
        objPB.getMessage();
    }
}

