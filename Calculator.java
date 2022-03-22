import java.util.*;
public class Calculator{
 public static void main(String args[])
 {
	 Scanner a=new Scanner(System.in);
 System.out.println("Enter the first Number: ");
 int n1=a.nextInt();
 System.out.println("Enter the second Number: ");
 int n2=a.nextInt();
 System.out.println("ADDITION :" +(n1+n2));
 System.out.println("DIFFERENCE :" +(n1-n2));
 System.out.println("DIVISION :" +(n1/n2));
 System.out.println("MULTIPLICATION :" +(n1*n2));
 }
}
