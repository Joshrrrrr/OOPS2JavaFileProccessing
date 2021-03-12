package com.test.lab7;

public class Employee extends Person{
	int personnelNumber;
	int nextNumber;
	Date startDate;
	Job job;
	public Employee(String firstname, String surname, Date dateofbirth,
			String gender,int personnelNumber,
	int nextNumber,
	Date startDate,
	Job job) {
		super(firstname, surname, dateofbirth, gender);
		setPersonnelNumber(personnelNumber);
		setNextNumber(nextNumber);
		setStartDate(startDate);
		setJob(job);
		// TODO Auto-generated constructor stub
	}
	public int getPersonnelNumber() {
		return personnelNumber;
	}
	public void setPersonnelNumber(int personnelNumber) {
		this.personnelNumber = personnelNumber;
	}
	public int getNextNumber() {
		return nextNumber;
	}
	public void setNextNumber(int nextNumber) {
		this.nextNumber = nextNumber;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public String toString(){
		Filer filer2 = new Filer("names.txt");
		filer2.openFile();
		filer2.writeToFile(this.firstname+" "+this.surname);
		return super.toString()+" Personnel Number: "+this.personnelNumber+" Start Date: "+this.startDate+this.job.toString();
	}
}
