
public class Employee {

	public long employeeId, employeePhone;
	   public String employeeName, employeeAddress;
	   public double basicSalary, specialAllowance=250.80, Hra=1000.50;
	    public Employee(long Id, long Phone, String Name, String Address) {
		   super();
		    this.employeeId = Id;
		    this.employeePhone = Phone;
		    this.employeeName = Name;
		    this.employeeAddress = Address;
	    }
	    
	    double salary;
		public double calculateSalary() {
		
		salary = basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
			return salary;
			}
		
		public double calculateTransportAllownce() {
			double transportAllownce = 10/100*basicSalary;
				return transportAllownce;
			
		}
		
}
