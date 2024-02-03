import java.util.Scanner;
public interface InterfaceClass {
  public void name ();
   void Id ();
   void Rollno();
   void info ();
   
}
class i implements InterfaceClass{
	 Scanner b = new Scanner(System.in);
	 String name;
	 public void name()
	 { 
		 System.out.println("Enter the name of Student");
		Scanner b = new Scanner(System.in);
		  name = b.next();		 
	 }
	 public void Id () {
		 System.out.println("Enter the Id of Student");
		 int id = b.nextInt();
		 
	 }
	 public void Rollno() {
		 System.out.println("Enter the Roll No of Student");
		 int rollno =b.nextInt();
	 }
	 public void info () {
		 
		System.out.println("Name : "+name);
	 }
	 public static void main(String[] args) {
		 InterfaceClass c = new i();
		 c.name();
		 c.Id();
		 c.Rollno();
		 c.info();
	}
}
