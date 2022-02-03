package nikita_code;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] multidimensionalArray = { {1,2},{2,3}, {3,4} };
	     
	      for(int i = 0 ; i < 3 ; i++){
	         //row
	         for(int j = 0 ; j < 2; j++){
	            System.out.print(multidimensionalArray[i][j] + " ");
	         }
	         System.out.println();
	      }
	}

}
