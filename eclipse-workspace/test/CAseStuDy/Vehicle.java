package CaseStudy;

import java.util.Scanner;

public class Vehicle {
	static Scanner sc = new Scanner(System.in);
	
	String company;
	String model;
	String number;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String company, String model, String number) {
		super();
		this.company = company;
		this.model = model;
		this.number = number;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void input() {
		
		System.out.println("vehicle company ");
		this.setCompany(sc.nextLine);
		
		System.out.println("enter model  ");
		this.setModel(sc.nextLine);
		
		System.out.println("num of vehicle");
		this.setNumber(sc.nextLine);
		
		
	}
	
}
