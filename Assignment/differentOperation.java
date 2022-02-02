package nikita_code;
import java.util.Scanner;
public class differentOperation {

 public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     int num1;
     int num2;
     int num3;
     int sum;
     int average;
     int product;
     int smallest;
     int largest;

     System.out.print("Enter First Integer: ");
     num1 = input.nextInt();
    System.out.print("Enter Second Integer: ");
     num2 = input.nextInt();
    System.out.print("Enter Third Integer: ");
     num3 = input.nextInt();

     sum = num1 + num2 + num3;
     average = sum / 3;
     product = num1 * num2 * num3;
     smallest=num1;
     largest=num1;
if (num2 < smallest)
smallest = num2;
if (num3 < smallest)
smallest = num3;
if (num2 > largest)
largest = num2;
if (num3 > largest)
largest = num3;
     System.out.println("The sum is = " + sum);
     System.out.println("The average is = " +average);
     System.out.println("The product is = " +product);
    System.out.println("The smallest number is = " + smallest);
System.out.println("The largest number is = " + largest);
 }
}
/*output
*Enter First Integer: 10
*Enter Second Integer: 20
*Enter Third Integer: 30
*The sum is = 60
*The average is = 20
*The product is = 6000
*The smallest number is = 10
*The largest number is = 30
*/
