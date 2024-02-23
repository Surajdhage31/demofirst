// *IT IS EXAMPLE OF SINGLE INHRITANES *
//  CALCULATE THE AREA AND VOLUME ?
package fullCode;

import java.util.*;

class Room1 {
	Scanner sc = new Scanner(System.in);
	int Length, Breath;
	//Taking length and breadth here
	void Room2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int a = sc.nextInt();
		System.out.println("Enter Breadth");
		int b = sc.nextInt();
		Length = a;
		Breath = b;

	}
    //Calculate the area 
	void Area() {
		int Area = Length * Breath;
		System.out.println("Area = " + Area + "cm");
	}
}

class BadRoom extends Room1 {  // Class is inherited here
	int Heigth;
// *To Calculate the Volume Taking Heigth,Length and Breadth*
	void BadRoom() {
//		Scanner sc = new Scanner(System.in);
		System.out.println("Enter heigth");
		int c = sc.nextInt();
		Heigth = c;

//    	  Room1 Sc = new Room1();
//    	  Sc.Room2();
		System.out.print("Enter the length = ");
		int Length = sc.nextInt();
		System.out.print("Enter the Breadth = ");
		int Breadth = sc.nextInt();

		int Volume = Length * Breadth * Heigth;
		System.out.println("Volume = " + Volume + "cm");

	}
// All method are call here
	void Display() {
		Room1 room = new Room1();
		BadRoom Bed = new BadRoom();
		room.Room2();
		room.Area();
		Bed.BadRoom();
		// ;Bed.Volume();

		// System.out.println("Area = "+Area);
		// System.out.println("Volume = "+volume);
	}
}
// Main class is here To print the output 
class Room {
	public static void main(String[] args) {
		BadRoom Bed = new BadRoom();
		Bed.Display();
	}
}
