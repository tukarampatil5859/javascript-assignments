package CaseStudy;

import java.util.List;

public class Service_Request {
	String cust_name;
	List<Service> serv_list;
	String veh_number;
	
	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public List<Service> getServ_list() {
		return serv_list;
	}

	public void setServ_list(List<Service> serv_list) {
		this.serv_list = serv_list;
	}

	public String getVeh_number() {
		return veh_number;
	}

	public void setVeh_number(String veh_number) {
		this.veh_number = veh_number;
	}
	
	public void add_item(Service serv) {
		
	}
	
	public void process_request() {
		
	}
	
	public Service_Request(String cust_name,String veh_number) {
		this.cust_name = cust_name;
		this.veh_number = veh_number;
	}
	
	
}
