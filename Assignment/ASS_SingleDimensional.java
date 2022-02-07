package nikita_code;
import java.util.Scanner;
public class ASS_SingleDimensional {

public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     System.out.println("Enter the no of elements in array:");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter the elements:");
     for(int i=0;i<n;i++)
     {
    	 a[i]=sc.nextInt();
     }
     System.out.print("Array Elements are:");
     for(int i=0;i<n;i++)
     {
    	 System.out.print(a[i]+" ");
     }
	}
}
