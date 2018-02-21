package org.testproject.spring.dependencyinjection.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireContext {

	/*
	 * constructor
	 * 
	 * In Spring “Autowiring by Constructor means” autowiring is actually autowiring by type it means
	 * if data type of a bean is same as the data type of other bean constructor argument, 
	 * auto wire it.Spring container looks at the properties of the beans on which autowire attribute 
	 * is set to constructorin the XML configuration file.
	 * It then tries to match and wire its properties with the beans defined by the same data type
	 * of constructor argument in the configuration file.
	 * 
	 * For example, if a “circleConstructor” bean exposes an “center” constructor argument of Point data type, 
	 * Spring will find these “center” in current container and wire it automatically. 
	 * And if no matching found, just do nothing.
	 * 
	 * For example, if spring autowiring by autodetect. Auto wiring the “center” bean into “circle“,
	 * via constructor or  by type,
	 * Its based on the implementation of Circle bean. 
	 * Spring will find the “center” in current container and wire it automatically one of constructor
	 * or  by type.
	 * If a default constructor is supplied, auto detect will chooses wire by constructor.
	 * If a default constructor is not found, auto detect will chooses wire by type.
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		  Circle circle = (Circle) context.getBean("circleConstructor");
		  circle.draw();		
	}
}
