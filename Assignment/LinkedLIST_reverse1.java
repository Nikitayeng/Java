package Collection;
import java.util.*;
public class LinkedLIST_reverse1 {
  public static void main(String[] args) {
    // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("Pink");
          l_list.add("orange");
      
        // print original list
   System.out.println("Original linked list:" + l_list);  
	 
    Iterator itr = l_list.descendingIterator();

     // Print list elements in reverse order
     System.out.println("Elements in Reverse Order:");
     while (itr.hasNext()) {
        System.out.println(itr.next());
     }
  }
}