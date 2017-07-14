package Package1.day2;

public class Emp_instances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp Ram = new Emp() ;
		Emp Anu = new Emp() ;
		// Emp Harish = new Emp() ;
		
		Ram.basic = 70000;
		Ram.perks = 2000;
		Anu.basic = 75000;
		Anu.perks = 2000;
		
		System.out.println("Ram Total pay :" ); 
		Ram.calc_total();
		System.out.println("Anu Total Pay :" );
		Anu.calc_total();
		
	}

}
