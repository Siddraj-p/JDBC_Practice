package com.Java_8;


public class MultiThreding_java8 {
private static final int MAX_PRIORITY = 0;

public static void main(String[] args) {
	Runnable rr= ()-> {for(int i=0;i<=5;i++) {
		System.out.println("hey ram");
		
	}
	};
	Runnable t= ()-> {for(int i=0;i<=5;i++) {
		System.out.println("hey maa");
	}
	};	
	Thread th=new Thread(rr);
	th.setPriority(MAX_PRIORITY);
	
	th .start();
	th.getName();
	th.getPriority();
	
	
	Thread n=new Thread(t);
		n.start();
		n.setPriority(4);
	n .start();
	n.getName();
	n.getPriority();
	
	
	
	for(int i=0;i<=5;i++) {
		System.out.println("hey ram");
	}
}
}

