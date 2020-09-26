package CaseStudy;

public class Oil extends Service{
	double cost;
	
	public Oil() {
		
	}
	
	public Oil(String descString, double cost) {
		super(descString);
		this.cost = cost;
	}
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void display() {
		
	}
	
	public void input() {
		
	}
	
	public double price() {
		return 0.00;
	}
	
	
	
}
