package fullCode;

import java.util.*;

public class largerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the any three number");
		int Num = num.nextInt();
		int value = num.nextInt();
		int no = num.nextInt();
		if (Num > value && Num > no) 
		{
			System.out.println(Num + " Number is large");
		}
		
		else if(value>Num&&value>no)
		{
		System.out.println(value+" Number is large");
		}
		
		else
		{
			System.out.println(no+" Number is large");
		}
		
	}

	

}
