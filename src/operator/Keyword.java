package operator;

public class Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Test num = new Test(12,11);
  num.display();
	}

}
class Test
{
	int a,b;
	Test(int a ,int b)
	{
		 this.a=a;
		 this.b=b;//this use to refer instance variable
}
	void display()
	{
		System.out.println(a+" "+b);
	}
}
