package com.Java_8;

public class Amomyous_inner_class {
	public static void main(String[] args) {
		Runnable rr=new Runnable() 
//Runnable is the object of the Anonymous class
				
				
				{//it is the anonymous class which does not have any class name 
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("hey ram");
			}
		};
		
		Thread th=new Thread(rr);
		th.setPriority(2);
		th.start();
	for(int i=0;i<=4;i++) {  		
		System.out.println("helo");
	}
		
		
	}

}
