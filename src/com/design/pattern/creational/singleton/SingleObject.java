package com.design.pattern.creational.singleton;

public class SingleObject {

	  private int count=0;
	   //create an object of SingleObject
	   private static SingleObject instance = new SingleObject();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleObject(){}

	   //Get the only object available
	   public static SingleObject getInstance(){
	      return instance;
	   }

	   public void increment()
	   {
		   count++;
	   }
	   
	   public void showMessage(){
	      System.out.println("Hello World! "+count);
	   }
	}