package com.test.lab7;

public class Control {
	public static void main(String[] args) {
		Date DOB = new Date(1,2,2000);
		Job MyJob = new Job(10000,144,"dactor");
		Person person1 = new Person("Josh","Reilly",DOB,"male");
		System.out.println(person1);
		Date JobStartDate = new Date(10,12,2020);
		Employee employee1 = new Employee("June","Reilly",DOB,"male",123,2,JobStartDate,MyJob);
		System.out.println(employee1);
	}

}
