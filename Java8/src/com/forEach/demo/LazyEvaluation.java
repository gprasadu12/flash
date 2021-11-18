package com.forEach.demo;

import java.util.ArrayList;
import java.util.List;

public class LazyEvaluation {
	
	public static void main(String a[]) {

		List<Integer> list=new ArrayList<>();
		
		for(int i=1;i<=100;i++) {
			list.add(i);
		}
		
		System.out.println(list.stream().filter(i->{
			System.out.println("hi");
			return true;
		}).findFirst().orElse(0));
}
}
