package nikita_code;

class Addition{
	public void add()
	{
		int x,y=30,z=10;
		x=y+z;
		System.out.println("Add="+x);
	}
}
//extending Addition
class Subtraction extends Addition{
	void sub()
	{
		int x,y=30,z=10;
		x=y-z;
		System.out.println("Sub="+x);
	}
}
//extending same class Addition
class Multiplication extends Addition{
	void Multi()
	{
		int x,y=30,z=10;
		x=y*z;
		System.out.println("Multiply="+x);
	}
}
public class HierarchicalEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating instance(object)
		Multiplication obj=new Multiplication();
		//calling base class function
		obj.add();
		//calling derive class function
		obj.Multi();

	}

}