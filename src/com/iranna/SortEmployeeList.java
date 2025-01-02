package com.iranna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Employee {

    private int id;
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and Setters (omitted for brevity)
    

    // Override toString() method for better readability
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

   
}
public class SortEmployeeList {
	 public static void main(String[] args) {
	        List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(1, "John Doe", 30, 50000.0));
	        employees.add(new Employee(2, "Jane Smith", 28, 60000.0));
	        employees.add(new Employee(3, "David Lee", 35, 45000.0));
	        employees.add(new Employee(4, "Anna Jones", 25, 70000.0));

	        // Sort employees by salary in ascending order
	        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
	        System.out.println("Employees sorted by salary in ascending order:");
	        employees.forEach(System.out::println);
	        
	        

	        // Sort employees by salary in descending order
	        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed());
	        System.out.println("\nEmployees sorted by salary in descending order:");
	        employees.forEach(System.out::println);
	        
	        //
	    
	    }
}
