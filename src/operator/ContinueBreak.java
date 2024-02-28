package operator;

public class ContinueBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Loop1: for(int j = 1 ;j<100;j++)
   {
	   System.out.println("");
	   if(j>=10) break;
	   for(int i=1;i<=100;i++)
	   {
		   System.out.print(" *");
		   if(i==9)
			   continue Loop1;
				   
	   }
   }
   //System.out.println("Terminate by break");
	}
   
}
