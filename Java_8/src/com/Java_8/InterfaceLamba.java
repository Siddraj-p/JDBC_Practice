package com.Java_8;


interface Inte {
	public void m1();
	
}

/*
class Demo{
	public void m1() {
		System.out.println("hey buddy");
		
	}
}*/



public class InterfaceLamba
{
	public static void main(String[] args) {
		
	
	Inte  i=()->System.out.println("hey bidddy");
	i.m1();
	
}
}
// using lamda expression we can implement the method
