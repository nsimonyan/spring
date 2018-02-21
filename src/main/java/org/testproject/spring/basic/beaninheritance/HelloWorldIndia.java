package org.testproject.spring.basic.beaninheritance;


public class HelloWorldIndia{
	/*
	 * Following is the configuration file Beans.xml where we defined "helloWorldInheritance" bean 
	 * which has two properties message1 and message2. 
	 * Next "helloWorldIndia" bean has been defined as a child of "helloWorldInheritance" bean 
	 * by using parent attribute. 
	 * The child bean inherits message2 property as is,
	 * and overrides message1 property and introduces one more property message3.
	 */
	   private String message1;
	   private String message2;
	   private String message3;

	   public void setMessage1(String message){
	      this.message1 = message;
	   }
	   public void setMessage2(String message){
	      this.message2 = message;
	   }
	   public void setMessage3(String message){
	      this.message3 = message;
	   }
	   public void getMessage1(){
	      System.out.println("India Message1 : " + message1);
	   }
	   public void getMessage2(){
	      System.out.println("India Message2 : " + message2);
	   }
	   public void getMessage3(){
	      System.out.println("India Message3 : " + message3);
	   }
}