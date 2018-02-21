package com.infotech.client;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.Set;

import com.infotech.model.Department;
import com.infotech.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1009, "Sam", 90000.00, "sam@infotech.com");
		Employee e2 = new Employee(2009, "Martin", 30000.00, "martin@infotech.com");
		Employee e3 = new Employee(3009, "Joya", 50000.00, "joya@infotech.com");
		Employee e4 = new Employee(4009, "Harry", 70000.00, "harry@infotech.com");
		Employee e5 = new Employee(5009, "Sean", 80000.00, "sean@infotech.com");
		
		Department d1 = new Department(10001, "IT", "Boston");
		Department d2 = new Department(10002, "Finance", "Chennai");
		
		Map<Employee,Department> empDeptMap = new HashMap<>();
		
		empDeptMap.put(e1, d1);
		empDeptMap.put(e2, d1);
		empDeptMap.put(e3, d1);
		
		empDeptMap.put(e4, d2);
		empDeptMap.put(e5, d2);
		
		Set<Entry<Employee, Department>> entrySet = empDeptMap.entrySet();
		for (Entry<Employee, Department> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("--------------------------------------------");
		
		Set<Employee> keys = empDeptMap.keySet();
		for (Employee key : keys) {
			System.out.println(key);
			Department value = empDeptMap.get(key);
			System.out.println(value);
			
		}
		
		System.out.println("--------------------------------------------");
		
		empDeptMap.forEach(new BiConsumer<Employee, Department>() {

			@Override
			public void accept(Employee key, Department value) {
				System.out.println(key);
				System.out.println(value);
			}
		});
		
		System.out.println("--------------------------------------------");
		empDeptMap.forEach((key,value)->{
			System.out.println(key);
			System.out.println(value);
		});
		
		System.out.println("--------------------------------------------");
		Collection<Department> values = empDeptMap.values();
		for (Department department : values) {
			System.out.println(department);
		}
	}

}
