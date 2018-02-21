package org.testproject.spring.destroy;

public class HelloWorldDestroyMethod /*implements DisposableBean */{
	
	   private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }

	   /*
	    * Destroy() method is called with singleton scope bean but not with prototype because
	    * Spring does not manage the complete lifecycle of a prototype bean: 
	    * the container instantiates, configures, decorates and otherwise assembles a prototype object, 
	    * hands it to the client and then has no further knowledge of that prototype instance. 
	    * For releasing resources try to implement a custom bean post processor.
	    *
	    * destroymethod specifies a method that is called just before a bean is removed from the 
	    * container
	    * 
	    * The org.springframework.beans.factory.DisposableBean interface specifies
	    *  a single method −
	    *  void destroy() throws Exception;
	    */
//	   public void destroy() {
//		      // do some destruction work
//		   }
	   
	   public void destroy() {
		      // do some destruction work
		   }
}