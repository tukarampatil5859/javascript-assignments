package CaseStudy;

public class Bill {
	double amount;
	double paid_amount;
	Service_Request req;
	
	public Bill(Service_Request req) {
		this.req = req;
	}
	
	public double compute_amount() {
		return 0.00;
	}
	
	public double compute_tax() {
		return 0.00;
	}
	
	public double compute_total_bill() {
		return 0.00;
	}

	public double getPaid_amount() {
		return paid_amount;
	}

	public void setPaid_amount(double paid_amount) {
		this.paid_amount = paid_amount;
	}

	public void display() {
		
	}

	void computeAmount()
	{
		if (sr.serviceList!=null) {
		for (Service s:sr.serviceList)
		{
			if (s instanceof Maintainance)
			{
				Maintainance m =(Maintainance) s;
				m.display();
				System.out.println("\nLabour Charges : "+m.getLabourCharges());
				amount+=m.price();
			}
			if (s instanceof Oil)
			{
				Oil o = (Oil) s;
				o.display();
				amount+=o.price();
			}
		}
		
 	}
	}
	void computeTax() {
		double tax=(amount*12.6)/100;
		System.out.println("-------------------------------");
		System.out.println("\nTotal Amount   : "+String.format("%.2f", this.amount));
		System.out.println("Tax on Total   : "+String.format("%.2f", tax));
		  
				
		this.amount+=tax;
		System.out.println("Total (tax inc): "+String.format("%.2f", this.amount));
		
	}
	
	
	
	
}
