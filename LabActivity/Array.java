package package_Pro;

import java.util.Scanner;

public class Array {
	  int size;
	int[] accept() {

		Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
 size=sc.nextInt();
int a[]=new int[size];
	System.out.println("enter the "+size+ " element ");
	for(int i=0;i<size;i++) {
		a[i]=sc.nextInt();
		}
	return a;

	}
	int a1[]=accept();
	public void ascendingArray() {
		//int a1[]=accept();
		System.out.print("Sort the array element Ascending order: ");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				
				if(a1[i]>a1[j]) {
					int temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
				
			}
			System.out.print(a1[i]+" ");
		}
		System.out.println();
	}
	public void descendingArray() {
		//int a1[]=accept();
		System.out.print("Sort the array element Descending order: ");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				
				if(a1[i]<a1[j]) {
					int temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
				
			}
			System.out.print(a1[i]+" ");
		}
		System.out.println();
	}
	 public void largestArray(){
		int max=a1[0];
		for(int i=0;i<size;i++) {
		if(a1[i]>max) {
			max=a1[i];
		}
		}
		System.out.println("largest no:"+max);
	}
	 public void smallestArray(){
		int min=a1[0];
		for(int i=0;i<size;i++) {
		if(a1[i]<min) {
			min=a1[i];
		}
		}
		System.out.println("Smallest no:"+min);
	}

public void averageArray() {
    double avg,sum=0;
	  for(int i=0;i<size;i++) {
		 sum=sum+a1[i];
	}
	  avg=sum/size;
	  System.out.println("Average of array: "+avg);
}
}
