package com.prasadu.start;

import java.util.HashMap;
import java.util.Map;

public class MapDebug {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1);
		Employee e2=new Employee(1);
		Map<Employee,String> map=new HashMap<>();
		map.put(e1, "prasadu");
		map.put(e2, "prasadu");
		System.out.println(map.size());
		
		Integer i1=new Integer(1);
		Integer i2=new Integer(1);
		Map<Integer,String> mp=new HashMap<>();
		mp.put(i1, "one");
		mp.put(i2,"one");
		System.out.println(mp.size());
	}

}

class Employee{
	int id;
	public Employee(int id) {
		this.id=id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
