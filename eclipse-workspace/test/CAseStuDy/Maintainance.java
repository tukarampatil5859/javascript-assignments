package CaseStudy;

import java.util.List;

public class Maintainance extends Service{
	
	double labor_charges;
	List<Part> part_List;
	
	public Maintainance() {
		
	}
	
	public Maintainance(String desc, double labor_changes) {
		super(desc);
		this.labor_charges =labor_changes;
	}
	
	public double getLabor_charges() {
		return labor_charges;
	}

	public void setLabor_charges(double labor_charges) {
		this.labor_charges = labor_charges;
	}

	public List<Part> getPart_List() {
		return part_List;
	}

	public void setPart_List(List<Part> part_List) {
		this.part_List = part_List;
	}

	public void add_part(List<Part> new_part) {
		
	}
	
	public void display() {
		
	}
	
	public void input() {
		
	}
	
	public double price() {
		
		return 0.00;
	}
	
	
}
