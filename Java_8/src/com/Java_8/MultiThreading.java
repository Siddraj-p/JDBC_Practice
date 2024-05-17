package com.Java_8;

public class MultiThreading {
	public static void main(String[] args) {
		
		Runnable r=()->System.out.println("sidd");		
		
		Runnable rr=()-> System.out.println("hey maa");
		
		Thread th=new Thread(r);
		th.setPriority(4);
		th.start();		
		
		Thread t=new Thread(rr);
		t.start();
		System.out.println(t.getPriority());
		System.out.println(th.getPriority());


		for ( int i=0;i<=4;i++) {
			System.out.println("heloo");
		}
	}
}
