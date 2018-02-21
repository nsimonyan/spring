package org.testproject.spring.init;

public class HelloWorldInitMethod /* implements InitializingBean */{
	 
	
	   private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   //the init-method attribute specifies a method that is to be called
	   //on the bean immediately upon instantiation

	   /*
	    * The org.springframework.beans.factory.InitializingBean 
	    * interface specifies a single method −
	    * void afterPropertiesSet() throws Exception;
	    * 
	    * Thus, you can simply implement the above interface 
	    * and initialization work can be done inside afterPropertiesSet() method as follows 
	    * 
	    
	   public void afterPropertiesSet() {
			System.out.println("afterPropertiesSet Init method !!!");		   
		}
	   */
	   
	   public void init() {
			System.out.println("Init method !!!");
		}
}