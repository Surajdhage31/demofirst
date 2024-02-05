package vegetarian;
import java.util.Scanner;
public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner menu = new Scanner(System.in);
    System.out.println("Enter your choice");
    System.out.println("1.Break-fast ,2.lunch,3.Dinner");
    int choice = menu.nextInt();
    switch(choice)
    {
    case 1 :
    {
    	 System.out.println("Menu");
    	 System.out.println("Pleses oder your favourite item");
    	  System.out.println("1.Tea");
    	  System.out.println("2.coffee");
    	  System.out.println("3.pohe");
    	  System.out.println("4.vada_pav");
    	  System.out.println("5.pav bhaji");
    	  System.out.println("6.dosa");
    	  int Menu = menu.nextInt();
    	  switch (Menu)
    	  {
    	  case 1 :
    	  {
    		  System.out.println(" please paid for Tea Rs 10");
    		  int fee = menu.nextInt();
    		  int price = 10 ;
    		  String massage =(price == fee)?"paid Rs : "+fee:"not enough fund";
    		  System.out.println(massage);
    		  break ;
    	  }
    	  case 2:
    	  {
    		  System.out.println(" please paid for Coffee Rs 15");
    		  int fee = menu.nextInt();
    		  int price = 15 ;
    		  String massage =(price == fee)?"paid Rs : "+fee:"not enough fund";
    		  System.out.println(massage);
    		  break ;
    	  }
    	  case 3:
    	  {
    		  System.out.println(" please paid for Pohe Rs 25");
    		  int fee = menu.nextInt();
    		  int price = 25 ;
    		  String massage =(price == fee)?"paid Rs : "+fee:"not enough fund";
    		  System.out.println(massage); 
    		  break ;
    	  }
    	  case 4:
    	  {
    		  System.out.println(" please paid for vada pav Rs 15");
    		  int fee = menu.nextInt();
    		  int price = 15 ;
    		  String massage =(price == fee)?"paid Rs : "+fee:"not enough fund";
    		  System.out.println(massage);
    		  break ;
    	  }
    	  case 5:
    	  {
    		  System.out.println(" please paid for Pav bhaji Rs 40");
    		  int fee = menu.nextInt();
    		  int price = 40 ;
    		  String massage =(price == fee)?"paid Rs : "+fee:"not enough fund";
    		  System.out.println(massage);  
    		  break ;
    	  }
    	  case 6 :
    	  {
    		  System.out.println(" please paid for Dosa Rs 50");
    		  int fee = menu.nextInt();
    		  int price = 50 ;
    		  String massage =(price == fee)?"paid Rs : "+fee:"not enough fund";
    		  System.out.println(massage);  
    		  break ;
    	  }
    	  }
    }
    }
 
	}

}
