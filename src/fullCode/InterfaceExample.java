package fullCode;
import java.util.Scanner;
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shape length = new Shape();
     length.display1();
     length.display2();
	}

}
interface Circle{
   double pi = 3.14 ;
   void display1();
   void display2();
   }
class Shape implements Circle
{   Double area ,radius;
   Scanner sc = new Scanner(System.in);
	
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius of Circle");
		 radius =  sc.nextDouble();
		area = 4*pi*radius*radius;
		System.out.println("Area of spere is "+area);
	}
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius for sphere");
		radius  = sc.nextDouble();
		area =(4/3)*pi*(radius*radius*radius);
		System.out.println("volume of sphere id "+area);
		
	}
	
}