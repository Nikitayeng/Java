package nikita_code;

public class Employee1 {

	private String name;
	private int age;
	private String address;

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	}
	class Test{
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Employee1 e=new Employee1();
	        e.setName("Monika");
	        e.setAge(22);
	        e.setAddress("Pune");
	        System.out.println("name is:"+e.getName());
	        System.out.println("Age is:"+e.getAge());
	        System.out.println("Address is:"+e.getAddress());
		}
	}