package nikita_code;

class shape{
	void display()
	{
		System.out.println("inside display");
	}
}
class rectangle extends shape{
	void area()
	{
		System.out.println("inside area");
	}
}
class cube extends rectangle{
	void volume()
	{
		System.out.println("inside volume");
	}
}
public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       cube c=new cube();
       c.volume();
       c.area();
       c.display();
	}

}