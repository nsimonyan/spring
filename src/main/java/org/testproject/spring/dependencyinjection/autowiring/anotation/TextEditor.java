package org.testproject.spring.dependencyinjection.autowiring.anotation;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	private SpellChecker spellChecker;

	@Autowired
	   public TextEditor(SpellChecker spellChecker){
	      System.out.println("Inside TextEditor constructor." );
	      this.spellChecker = spellChecker;
	   }
	   public void spellCheck(){
	      spellChecker.checkSpelling();
	   }
	   
	/*
	 * by property
	 
	 @Autowired
	   private SpellChecker spellChecker;

	   public TextEditor() {
	      System.out.println("Inside TextEditor constructor." );
	   }
	   public SpellChecker getSpellChecker( ){
	      return spellChecker;
	   }
	   public void spellCheck(){
	      spellChecker.checkSpelling();
	   }
	*/

	/*
			setter autowire
	 *    	private SpellChecker spellChecker;

		@Autowired
	 
	   public void setSpellChecker( SpellChecker spellChecker ){
	      this.spellChecker = spellChecker;
	   }
	   public SpellChecker getSpellChecker( ) {
	      return spellChecker;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	   */
	}