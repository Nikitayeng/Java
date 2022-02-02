package nikita_code;

public class UNBOXING {

	public UNBOXING() {
		
	}


		
	


//Java program to convert object into primitives  
//Unboxing example of Integer to int  
 
public static void main(String args[]){    
//Converting Integer to int    
Integer a=new Integer(3);    
int i=a.intValue();//converting Integer to int explicitly  
int j=a;//unboxing, now compiler will write a.intValue() internally    
  
System.out.println(a+" "+i+" "+j);    
}}
*/ OUTPUT
*3 3 3
/*	
	
	
