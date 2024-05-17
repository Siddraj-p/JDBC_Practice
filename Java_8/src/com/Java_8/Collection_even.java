package com.Java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Collection_even {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(19);
		l.add(2);
		l.add(3);
		l.add(765);
		l.add(2345);
		l.add(1);
		System.out.println(l);
		l.stream().forEach(System.out::println);
		Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(l,c);
		System.out.println(l);
		
					
	}

}
