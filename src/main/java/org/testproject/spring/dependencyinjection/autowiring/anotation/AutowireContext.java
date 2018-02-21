package org.testproject.spring.dependencyinjection.autowiring.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireContext {

	/**
	 * by  anotation
	 * instead of using XML to describe a bean wiring, 
	 * you can move the bean configuration into the component class itself by using annotations
	 *  on the relevant class, method, or field declaration.1
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		  Student student = (Student) context.getBean("student");
		  
		  TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
	
	      Profile profile = (Profile) context.getBean("profile");
	      profile.printAge();
	      profile.printName();
	      /*
	       try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/userLibrary.xml")) {
  				service = context.getBean(UserLibrary.class);
}
	       */
	}
}
