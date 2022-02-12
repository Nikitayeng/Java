package collections;

class equhash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EandH g1 =new EandH("a",1);
		EandH g2 =new EandH("b",1);	
				if(g1.hashCode() == g2.hashCode())
		        {
		  
		            if(g1.equals(g2))
		                System.out.println("Both Objects are equal. ");
		            else
		                System.out.println("Both Objects are not equal. ");
		      
		        }
		        else
		        System.out.println("Both Objects are not equal. ");
	}

}
