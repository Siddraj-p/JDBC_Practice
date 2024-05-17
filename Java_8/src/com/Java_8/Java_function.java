package com.Java_8;

import java.util.function.Function;

public class Java_function {

	public static void main(String[] args) {
		Function <Integer,Integer >    f=i->i*i;
		System.out.println(f.apply(39));
		
	}
}
