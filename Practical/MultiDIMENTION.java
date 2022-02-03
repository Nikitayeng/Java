package nikita_code;

public class MultiDIMENTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] multidimensionalArray = { {1,2,3},{4,5,6}, {7,8,9} };
	     
	      for(int i = 0 ; i < 3 ; i++){
	         //row
	         for(int j = 0 ; j < 3; j++){
	            System.out.print(multidimensionalArray[i][j] + " ");
	         }
	         System.out.println();
	      }
	}

}
