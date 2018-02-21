package org.testproject.spring.dependencyinjection.autowiring.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireContext {

	/**
	 *by type
	 * For example, if a “circle” bean exposes an “center” property of Point data type, 
	 * Spring will find these “center” in current container and wire it automatically.
	 * And if no matching found, just do nothing.
	 *
	 *With autowire by type enabled, you do not need to declares the property tag anymore. 
	 *As long as the “center” beans are same data type as the property of “circle” bean,
	 * which is “center“, Spring will wire it automatically.	 *
	 *
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		  Circle circle = (Circle) context.getBean("circle");
		  circle.draw();		
	}
}
