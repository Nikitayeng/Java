
public class Trainee extends Employee{

	
	 public Trainee(long Id, long Phone, String Name, String Address, double salary) {
		   super(Id, Phone, Name, Address);
		   this.employeeId = Id;
		    this.employeePhone = Phone;
		    this.employeeName = Name;
		    this.employeeAddress = Address;
		    this.basicSalary=salary;
}



public double calculateTransportAllownce() {
double transportAllownce = 15*basicSalary/100;
return transportAllownce;

}
}