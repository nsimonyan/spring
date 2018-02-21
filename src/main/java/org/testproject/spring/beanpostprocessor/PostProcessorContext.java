package org.testproject.spring.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostProcessorContext {

	public void printMsg() {
	     AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	     HelloWorldBeanPostProcessor obj = (HelloWorldBeanPostProcessor) context.getBean("helloWorldPostContext");
	      obj.getMessage();
	      context.registerShutdownHook();// This will ensures a graceful shutdown and calls 
	      								// the relevant destroy methods
	      //while running Junits you might want to close the context but not while 
	      //in production environment so let Spring decide on when to close it
	     // shutting down the appcontext, you're just letting the program terminate.
	     //Call close()
	      /*
	       ConfigurableApplicationContext context = …
			// Destroy the application
			context.close();
			by the use of the close() method on the context object the ApplicationContext is closed
			 and the application is destroyed.


			context.registerShutdownHook();
			that register a Shutdown Hook with the JVM 
			so it is the JVM that will trigger Spring's close phase before JVM exits. 
			So on JVM exit, Spring's close phase will execute.
	       */
	}
}
