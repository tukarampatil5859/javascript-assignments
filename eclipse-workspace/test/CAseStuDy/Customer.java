package CaseStudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Vector;

public class Customer {
	String address;
	String mobile;
	String name;
	Map<String,vehicle> veh_list;
	
	public Customer() {
		
	}
	
	public Customer(String address, String mobile, String name, Vector<Vehicle> veh_list) {
		super();
		this.address = address;
		this.mobile = mobile;
		this.name = name;
		this.veh_list = veh_list;
	}
	
	public void display_vehicles() {
		
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vector<Vehicle> getVeh_list() {
		return veh_list;
	}

	public void setVeh_list(Vector<Vehicle> veh_list) {
		this.veh_list = veh_list;
	}
	
//	public void load_Customer(FileInputStream fin) {
//		
//	}
	
	public Vehicle new_Vehicle() {
		return null;
	}
	
	public void pay_bill(Bill bill) {
		
	}
	
//	public void store_customer(FileOutputStream fout) {
//		
//	}
	
}
