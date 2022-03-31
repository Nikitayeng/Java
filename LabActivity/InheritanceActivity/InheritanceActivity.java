
public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager(126534,237844,"Peter","Chennai India", 65000);
		System.out.println("Calculated Salary for Manager="+m.calculateSalary());
		
		
		Trainee t=new Trainee(29846, 442085, "Jack", "Mumbai India", 45000);
		 System.out.println("Calculated Salary for Trainee="+t.calculateSalary());
		 System.out.println("calculated transport allowance salary for manager="+m.calculateTransportAllownce());
			
		   System.out.println("calculated transport allowance salary for trainee="+t.calculateTransportAllownce());
		
	}

}

