package com.forEach.demo;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReference mr=new MethodReference();
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		list.forEach(mr::doubleIt);

	}
	public void doubleIt(int i) {
		System.out.println(i*2);
	}

}
