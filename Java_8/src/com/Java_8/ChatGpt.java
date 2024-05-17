package com.Java_8;
interface MyInterface {
    // Abstract method
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("Default method implementation");
    }
}

/*class MyClass1 implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implementation by MyClass1");
    }
}

class MyClass2 implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implementation by MyClass2");
    }
}*/


public class ChatGpt {
	public class Main {
	    public static void main(String[] args) {
	        // Using MyClass1
	        MyInterface myObject1 = new MyClass1();

	        // Implementing the abstract method using lambda expression
	        MyInterface myObject2 = () -> {
	            System.out.println("Abstract method implementation by Lambda");
	        };

	        // Using MyClass2
	        MyInterface myObject3 = new MyClass2();

	        // Calling methods
	        myObject1.abstractMethod();
	        myObject1.defaultMethod();

	        myObject2.abstractMethod();
	        myObject2.defaultMethod();

	        myObject3.abstractMethod();
	        myObject3.defaultMethod();
	    }
	}
	
}
