package com.Java_8;
interface In{
	
	public void m2();
	default void m1() {
		System.out.println("hey buddy");
	}
}
 

	
public class Default_method {
	public static void main(String[] args) {
		In ii=()->{
			System.out.println("heyy ");
			ii.m2();
		};
		
		
	}

}
