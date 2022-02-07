package nikita_code;

public class Variable_Scope {

	public static void main(String[] args) {
		
		int x,y;
		x = 5; 
		{
		y = 6; 
		System.out.print(x + " " + y); 
		} 
		System.out.print(x + " " + y); 
		 }
		 }

	


