package org.testproject.spring.dependencyinjection.autowiring.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireContext {

	/**
	 * by  name
	 *For example, if a “triangle” bean exposes an “pointA, pointB & pointC” properties
	 *(that is, it has a setPointA(...) ... methods), 
	 *Spring will find these point bean(“pointA, pointB & pointC“) in current container 
	 *and wire it automatically. And if no matching found, just do nothing.
	 *
	 *With autowire by name enabled, you do not need to declares the property tag anymore.
	 * As long as the “pointA, pointB & pointC” beans are same name as the property of “triangle” bean, 
	 * which is “pointA, pointB & pointC”, Spring will wire it automatically.
	 *
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		  Triangle triangle = (Triangle) context.getBean("triangle");
		  triangle.draw();		
	}
}
