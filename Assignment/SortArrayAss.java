package com.demo;
import java.util.Arrays; 
public class SortArrayAss {

public static void main(String[] args){   
		    
		    int arr1[] = {
		            15,27,12,3,5};
		            
		    String arr2[] = {
		            "Jaya",
				    "Priya",
		            "Payal",
		            "Chiu",
		             };        
		    System.out.println("Original numeric array : "+Arrays.toString(arr1));
		    Arrays.sort(arr1);
		    System.out.println("Sorted numeric array : "+Arrays.toString(arr1));
		    
		    System.out.println("Original string array : "+Arrays.toString(arr2));
		    Arrays.sort(arr2);
		    System.out.println("Sorted string array : "+Arrays.toString(arr2));
		    
}
}


		

