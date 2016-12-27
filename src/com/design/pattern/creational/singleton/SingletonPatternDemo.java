package com.design.pattern.creational.singleton;

public class SingletonPatternDemo {
	   public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();
	      object.increment();
	      //show the message
	      object.showMessage();
	      SingleObject ob2=SingleObject.getInstance();
	      ob2.increment();
	      ob2.showMessage();
	      //New ibject is not created it actually assigned the same object to another variables. So the count
	      //is showing 2 next time.
	   }
	}
