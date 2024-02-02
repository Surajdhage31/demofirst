
public  class InterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface Bus {
			public void red(); 
			public void blue();
		}
		class Sleeper implements Bus {
			public void red () {
				System.out.println(" pune to mumbai ");
			}

			public void blue() {
			System.out.println("pune to mumbai");
				
			}
			
		}
	}
	

}
