package org.constructorInjection.spring;


public class Student {
   private int sid;
   private String sName;
   private int marks;
public Student(int sid, String sName, int marks) {
	super();
	this.sid = sid;
	this.sName = sName;
	this.marks = marks;
	System.out.println("id is " + this.sid);
	System.out.println("name is " + this.sName);
	System.out.println("marks is " + this.marks);

}
   
   
   
}
