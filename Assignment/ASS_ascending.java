package nikita_code;
import java.util.Scanner;

public class ASS_ascending {

public static void main(String[] args) {
		// TODO Auto-generated method stub
           int i,j,n,temp;
           System.out.println("Enter the no of elements in array:");
           Scanner s=new Scanner(System.in);
           n=s.nextInt();
           int a[]=new int[n];
           System.out.println("Enter the elements of array:");
           for(i=0;i<n;i++)
           {
        	   a[i]=s.nextInt();
           }
           for(i=0;i<n;i++)
           {
        	   for(j=i+1;j<n;j++)
        	   {
        		   if(a[i]>a[j])
                   {
                	   temp=a[i];
                	   a[i]=a[j];
                	   a[j]=temp;
                    }
        	   }
           }
           System.out.print("Array elements Ascending order:");
           for(i=0;i<n;i++)
           {
        	   System.out.print(a[i]+" ");
           }
	}
}
