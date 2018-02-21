package org.testproject.spring.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 
 * @author Admin
 *
 */
/*
 * The BeanPostProcessor interface defines callback methods that you can implement 
 * to provide your own instantiation logic, 
 * dependency-resolution logic, etc. 
 * You can also implement some custom logic after the Spring container finishes instantiating, 
 * configuring, and initializing a bean by plugging in one or more BeanPostProcessor 
 * implementations.
 * An ApplicationContext automatically detects any beans that are defined with 
 * the implementation of the BeanPostProcessor interface and registers these beans as 
 * postprocessors, to be then called appropriately by the container upon bean creation.
 */
public class InitHelloWorldPostProcessor implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) 
			throws BeansException {		      
			      System.out.println("BeforeInitialization : " + beanName);
			      return bean;  // you can return any other object as well
			   }
	public Object postProcessAfterInitialization(Object bean, String beanName) 
			throws BeansException {      
			      System.out.println("AfterInitialization : " + beanName);
			      return bean;  // you can return any other object as well
			   }
			  
}