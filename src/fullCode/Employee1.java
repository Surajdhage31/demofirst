package fullCode;

public class Employee1 {
   String name ;
   double basic_salary ;
   void Salary(String s ,int d)
   {
	   name = s ;
	   basic_salary=d;
   }
   void putdata()
   {
	   System.out.println("Name "+name);
	   System.out.println(" Basic Salary ="+basic_salary);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Employee1 e =new Employee1();
 e.Salary("suraj",25000);
 e.putdata();
	}

}
