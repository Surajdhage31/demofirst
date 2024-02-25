package operator;

import java.util.Scanner;

public class BirthYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Num = new Scanner(System.in);
		  System.out.println("Enter the Brith year ");
		   int Year = Num.nextInt(); //Brith year is store in Year 
		   System.out.println("Enter the Current Year");
		   int Cuyear = Num.nextInt();//Current year is store in Cuyear
		   int age = Cuyear - Year ;
		   if (age <18)
		   {
			   System.out.println(" You are child and Age is "+age);
		   }
		   else if(age>=18&&age<25)
		   {
			   System.out.println(" You are Young and Age is "+age);
		   }
		   else
		   {
			   System.out.println("You are Adult and Age is "+age);
		   }
	}

}
