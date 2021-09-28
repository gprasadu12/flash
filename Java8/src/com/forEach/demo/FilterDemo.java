package com.forEach.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		
//		list.stream().filter(i->
//		{
//			System.out.println(i);
//			return true;
//		}).collect(Collectors.toList());
		
		System.out.println(list.stream().map(i->i*2).collect(Collectors.toList()));

	}

}
