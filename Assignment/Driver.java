package nikita_code;
public class Driver 
{ 
public static void main (String[] args) 
{
 String[] strArr = new String[10]; 
for (int i = strArr.length-1; i>=0; i--) 
{
 strArr[i] = "b" +( i - 1) ; 
}
 System . out . println (" Value : " + strArr [5]) ;
 }
}
/*output
 * Value : b4
 */
