package com.Java_8;
interface St_Method{
	public static void m2() {
		System.out.println("hey budyy");
	}
}
public class Inter_part6 implements St_Method{
public static void main(String[] args) {
St_Method.m2();
	St_Method st=new Inter_part6();
	//st.m2();c.t.e static method present inside the interface can 
	//only invoke by taking name odf the interface and method 
	
	
}
}
