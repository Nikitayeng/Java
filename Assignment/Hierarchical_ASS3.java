package nikita_code;

class Teacher2{
	void teach()
	{
		System.out.println("Teaching Subject");
	}
}
class Student1 extends Teacher1{
	void listen()
	{
		System.out.println("Listening");
	}
}
class Principal extends Teacher2{
	void evaluate()
	{
		System.out.println("Evaluating");
	}
}
public class Hierarchical_ASS3 {
    public static void main(String[] args) {
	 Principal p=new Principal();
	 p.evaluate();
	 p.teach();
	 //p.listen(); will produce an error
	}
}