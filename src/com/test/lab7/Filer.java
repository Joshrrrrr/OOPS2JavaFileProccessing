package com.test.lab7;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Filer {
	String filename;
	File fileExample;
	Filer(String filename){
		setFilename(filename);
	}
	public void openFile(){
		fileExample = new File(filename);
	}
	public void writeToFile(String writethisline){
		try {
			PrintWriter myWriter = new PrintWriter(fileExample);
			myWriter.println(writethisline);
			myWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String readFile(){
		String roles ="";
		try {
			Scanner myScanner = new Scanner(fileExample);
			while(myScanner.hasNextLine()){
				roles+=myScanner.nextLine();
			}
			myScanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return roles;
	}
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
}
