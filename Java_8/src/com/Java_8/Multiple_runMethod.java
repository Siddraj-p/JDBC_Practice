package com.Java_8;

public class Multiple_runMethod {
public static void main(String[] args) {
	Thread th=new Thread(()->System.out.println("hey buddy"));
	th.start();
	Thread thr=new Thread(()->System.out.println("hey buddy"));
	thr.start();

	
}
}
