package nikita_code;

class Employee{
	float salary=20000;
}
class singleinheritance extends Employee{
	int bonus=5000;
	
	public static void main(String[] args) {
		singleinheritance si=new singleinheritance();
	System.out.println("Salary of developer is:"+si.salary);
	System.out.println("Bonus of developer is:"+si.bonus);	
	}
}