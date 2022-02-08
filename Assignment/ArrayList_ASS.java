package Collection;
import java.util.*;
public class ArrayList_ASS {
public static void main(String[] args) {
// Create a list and add some colors to the list
	List<String> l_Strings = new ArrayList<String>();
	l_Strings.add("Violet");
	l_Strings.add("Green");
	l_Strings.add("Pink");
	l_Strings.add("White");
	l_Strings.add("Black");
System.out.println("List before sort: "+l_Strings);
Collections.sort(l_Strings);
System.out.println("List after sort: "+l_Strings);    
}
}