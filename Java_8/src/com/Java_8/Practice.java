package com.Java_8;

import java.util.function.Predicate;

interface Demo{
	public static void main() {
		System.out.println("hey ram");
	}
	default void m1() {
		//default implementation 
	}
	
	public void SAM();
	//public void SAM1();
}

public class Practice {
public static void main(String[] args) {
	Demo.main();
	Runnable rr=() -> System.out.println("hey budyy");
	Thread t=new Thread(rr);
	t.start();
	
    Demo d=()->System.out.println("hey maa");
	Predicate <Integer> p=i->i%2==0;//conditional statement 
	System.out.println(p.test(15));
	d.SAM();
	Predicate<String> s=sc->sc.length()>5;
	System.out.println(s.test("hey maa "));
	
	
	
	}
}
