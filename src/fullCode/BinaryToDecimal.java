package fullCode;
import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the Binary number");
		int num = Scan.nextInt();
  int i = 0 ;
  int d  =0 ;
  int t = num ;
  while(t>0)
  {
	  int r = t % 10;
	  t = t / 10 ;
	 d = d + r *(int) Math.pow(2, i++);
  }
  System.out.println(" Decimal number is "+d);
	}

}
