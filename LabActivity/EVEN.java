import java.util.*;
public class EVEN {

   public static void main(String[] args) {
	   Scanner sc =new Scanner(System.in);
			   System.out.println("Enter the array list");
	   int n=sc.nextInt();
	   List<Integer> arr= new ArrayList<>();
	   for(int i= 0; i<4; i++) {
		   arr.add(sc.nextInt());
	   }
	   if(isListeven(arr)) {
		   System.out.println("List contains only even elements");
	   }else {
		   System.out.println("list doesn't contain only even elements");
	   }
	   }

static boolean isListeven(List<Integer> arr) {
	for(int i:arr) {
		if(i%2!=0)
			return false;
	}
	return true;
}
 
   }