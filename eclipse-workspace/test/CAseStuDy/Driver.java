
public class Driver {
	public static int menu( ) {
		
		System.out.println("0.exit");
		System.out.println("1.register customer");
		System.out.println("2.service request");
		System.out.println("3.today's business");
		System.out.println("enter choice");
		int ch=sc.nextInt();	
		return ch;
	}
	
	public static void main(String[] args) {	
		int ch=menu();
		while (true) {

		switch (ch) {
		case 0:
			System.exit(0);
			break;
		case 1:
			Register_customer();
			break;
		case 2:
			Service_Request();
			break;
		case 3:
			Todays_Business();
			break;

		default:
			break;
		}
		
		menu();
		}
		
	}

}

}
