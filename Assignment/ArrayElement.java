package Collection;
import java.util.*;
public class ArrayElement {

public static void main(String[] args) {
// Create a list and add some colors to the list
List<String> l_Strings = new ArrayList<String>();
l_Strings.add("Violet");
l_Strings.add("Green");
l_Strings.add("Pink");
l_Strings.add("White");
l_Strings.add("Black");
// Print the list
System.out.println(l_Strings);
// Update the third element with "Yellow"
l_Strings.set(2, "Black");
 // Print the list again
System.out.println(l_Strings);
}
}