package com.forEach.demo;

import java.util.Arrays;
import java.util.List;

public class MapReduceDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,1,1,1);
		
		System.out.println(list.stream().map(i->i*2).reduce(0,(c,e)->c+e));
		
		//System.out.println(list.stream());

	}

}
