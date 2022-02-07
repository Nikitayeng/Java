package nikita_code;
import java.util.Scanner;
public class ASS_MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i,j,row,col;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of rows:");
     row=sc.nextInt();
     System.out.println("Enter number of cols:");
     col=sc.nextInt();
     int a[][]=new int[row][col]; 
     System.out.println("Enter the "+row*col+" elements:");
     for(i=0;i<row;i++)
     {
    	 for(j=0;j<col;j++)
    	 {
    		 a[i][j]=sc.nextInt();
    	 }
     }
     System.out.println("Elements are:");
     for(i=0;i<row;i++)
     {
    	 for(j=0;j<col;j++)
    		 {
    		   System.out.print(a[i][j]+" "); 
    		 }
    	 System.out.println();
     }
	}

}