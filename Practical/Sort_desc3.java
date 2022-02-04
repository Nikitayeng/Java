package nikita_code;
import java.util.Arrays;
import java.util.Collections;
public class Sort_desc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			 String[] str= {"Mango","apple","grapes","papaya","pineapple","banana"," orage"};
			 Arrays.sort(str, Collections.reverseOrder());   
				System.out.println("Array elements in descending order: " +Arrays.toString(str));

			}
}