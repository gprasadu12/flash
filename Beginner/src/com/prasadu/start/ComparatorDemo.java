package com.prasadu.start;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int id;
	String name;
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
		list.add(new Student(1,"prasadu"));
		list.add(new Student(4,"ram"));
		list.add(new Student(2,"pandu"));
		list.add(new Student(3,"siv"));
		
		Collections.sort(list,(Student o1, Student o2) -> {
			if(o1.id>o2.id)
				return 1;
			else if(o1.id<o2.id)
				return -1;
			return 0;		
	});
		
		for(Student s:list) {
			System.out.println(s);
		}

	}

}
