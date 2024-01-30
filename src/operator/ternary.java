package operator;
import java.util.Scanner;
public class ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner num = new Scanner(System.in);
        System.out.println("Enter the opration + or substract -");
  
           String no = num.next();
        System.out.println("Enter two number");
        int a = num.nextInt();
        int b = num.nextInt();
         String sum = "add" ;
      //  String sub =  ;
         int Add = a+b;
         int Sub = a-b;
         int opration =( sum.equals(no))?(Add):(Sub);
         System.out.println(opration);
         String bus = "ram";
         int hash = bus.hashCode();
         System.out.println(hash);
         
//	}
	}
}
