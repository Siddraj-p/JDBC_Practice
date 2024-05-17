package com.Java_8;
interface intra {
public void m1();
public void m();
default void  m3() {
	System.out.println("hey buddy");
	
}

	
}
public class DefaultMethod implements intra  {
public void m1() {
	
}
public void m() {
	
}

//in the default method in the interface we can 
//add it at any time we cant get the error it is adv of the default method 
}
