package com.test.lab7;

public class Job {
	double salary;
	int jobID;
	String role;
	String checkroles;
	Job(double salary,int jobID, String role){
		Filer filer1 = new Filer("roles.txt");
		filer1.openFile();
		checkroles=filer1.readFile();
		setSalary(salary);
		setJobID(jobID);
		setRole(role);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getJobID() {
		return jobID;
	}
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		if(checkroles.contains(role))
		{
			this.role = role;
		}
		else{
			this.role = "Invalid role";
			System.out.println("Not a valid job role");
		}
	}
	public String toString(){
		return (" Job: "+this.role);
	}
}
