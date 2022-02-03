package nikita_code;

public class ASS_driver2 {

	public static void main(String[] args) {
	
		double [] dblArr = {3.5 , 6.8 , 2.3 , 9.1 , 1.0
		};
		 for (int i = 0; i < dblArr . length ; i ++) 
		{
		 dblArr [ i ] /= 2; 
		} 
		for (int i = dblArr . length - 1; i >= 0; i --) 
		{ 
		System . out . println (" Value : " + dblArr [ i ]) ;
		}
		 		
	}
}
/*output
 *Value : 0.5
 *Value : 4.55
 *Value : 1.15
 *Value : 3.4
 *Value : 1.75
 */

	


