package collecions;
import java.util.*;  
class Test123 {


public static void main(String args[]){  
  
ArrayList<String>al=new ArrayList<String>();  
al.add("Nikita");  
al.add("Sneha");  
al.add("Anu");  
al.add("Teju"); 
al.add("Darshu");
  
Collections.sort(al);  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
}  
}