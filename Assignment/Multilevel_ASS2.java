package nikita_code;

class Teacher1{
	void teach()
	{
	System.out.println("Teaching subject");	
	}
 }
class Student extends Teacher1{
	void listen()
	{
		System.out.println("Listening");
	}
}
class homeTution extends Student{
	void explains()
	{
		System.out.println("Does homework");
	}
}
public class Multilevel_ASS2 {


	public static void main(String[] args) {
		homeTution h=new homeTution();
        h.explains();
        h.listen();
        h.teach();
	}

}