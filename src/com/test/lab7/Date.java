package com.test.lab7;

public class Date {
	private int day;
	private int month;
	private int year;
		
	Date(int day,int month,int year){
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString(){
		return (this.day+"/"+this.month+"/"+this.year);
	}
}
