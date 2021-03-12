package com.test.lab7;

public class Person {
	String firstname;
	String surname;
	Date dateofbirth;
	String gender;
	public Person(String firstname,
	String surname,
	Date dateofbirth,
	String gender){
		setFirstname(firstname);
		setSurname(surname);
		setDateofbirth(dateofbirth);
		setGender(gender);
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String toString(){
		return ("firstname: "+this.firstname+" Surname: "+this.surname+" DOB: "+this.dateofbirth.toString()+" Gender: "+this.gender);
	}
}
