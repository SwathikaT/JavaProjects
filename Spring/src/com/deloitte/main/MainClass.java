package com.deloitte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.pojo.HelloIndia;
import com.deloitte.pojo.HelloWorld;
import com.deloitte.pojo.Point;
import com.deloitte.pojo.TextEditor;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		// ClassPathXmlApplication - type of IOC container
		/*Point point1 = (Point) context.getBean("pointBean");
		System.out.println(point1);

		Point point2 = (Point) context.getBean("pointBean");
		System.out.println(point2);

		point2.setX(6);
		point2.setY(7);
		System.out.println(point1);
		System.out.println(point2);
		
		HelloWorld ObjA = (HelloWorld) context.getBean("helloworld");
		ObjA.getMessage1();
		ObjA.getMessage2();
		
		HelloIndia ObjB = (HelloIndia) context.getBean("helloindia");
		ObjB.getMessage1();
		ObjB.getMessage2();//gets from parent,otherwise prints a null
		ObjB.getMessage3();*/
		
		//TextEditor tel =(TextEditor) context.getBean("textEditor");
		//tel.spellCheck();
		
		TextEditor te1 =(TextEditor) context.getBean("textEditorCDI");
		te1.spellCheck();
		
		TextEditor te2 =(TextEditor) context.getBean("textEditorSDI");
		te2.spellCheck();
		TextEditor te3 =(TextEditor) context.getBean("textEditorAWbN");
		te3.spellCheck();
		TextEditor te4 =(TextEditor) context.getBean("textEditorAWbT");
		te4.spellCheck();
		te4.getName();
		TextEditor te5 =(TextEditor) context.getBean("textEditorAWbC");
		te5.spellCheck();
		te5.getName();
		
		
		//((AbstractApplicationContext)context).registerShutdownHook();
	}
}
