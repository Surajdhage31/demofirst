package operator;
import java.util.*;
public class Reversestring {
public static void main(String[] args) {
	Scanner alpha = new Scanner(System.in);
	 System.out.println("Enter the String ");
	 
	  String s = alpha.next();
	  int i ,l ;
	  l=s.length();
	  System.out.print("Reverse String is ");
	  for(i=l-1;i>=0;i--)
	  {
		 System.out.print(s.charAt(i)); 
	  }
	  
}
}
