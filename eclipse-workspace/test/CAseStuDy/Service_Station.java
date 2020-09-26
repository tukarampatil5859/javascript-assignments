package CaseStudy;

import java.util.List;

public class Service_Station {
	List<Bill> bill_list;
	List<Customer> cust_list;	
	String name;
	
	public Service_Station(String name) {
		this.name = name;
	}
	
	public List<Bill> getBill_list() {
		return bill_list;
	}
	
	public void setBill_list(List<Bill> bill_list) {
		this.bill_list = bill_list;
	}
	
	public List<Customer> getCust_list() {
		return cust_list;
	}
	
	public void setCust_list(List<Customer> cust_list) {
		this.cust_list = cust_list;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double compute_cash() {
		return 0.00;
	}
	
	public void display_customer_list() {
		
	}
	
	public Customer findCustomer() {
		return null;
	}
	
	public void handle_service_request() {
		
	}
	
	public void load_customer_details() {
		
	}
	
	public void newCustomer() {
		
	}
	
	public void store_customer_details() {
		
	}
	
}
