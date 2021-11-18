package com.forEach.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(7,3,4,2,5,6);

		for(int i=0;i<6;i++) {
			System.out.println(list.get(i));
		}
		for(int i:list) {
			System.out.println(i);
		}
		
		Iterator i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//list.forEach(i ->System.out.println(i));
		list.forEach(System.out::println);

	}

}
