package com.deloitte.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class TextEditor {

	private SpellChecker spellChecker;
	private String name;
	
	public String getName() {
		System.out.println("Name: "+name);
		return name;
	}

	@Required
	//annotation better near set method
	public void setName(String name) {
		this.name = name;
	}

	public TextEditor() {
		System.out.println("Inside default TextEditor Constructor");
	}
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor Constructor");
		this.spellChecker=spellChecker;
	}
	
	public SpellChecker getSpellChecker() {
		System.out.println("Inside getSpellChecker ");
		return spellChecker;
	}

	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker ");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
		
	}
}
