package abstract1;

public class Abstract1 extends Bike {
	void run()
	{
		System.out.println("running safely");
		} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj = new Abstract1();  
		 obj.run();  
	}

}
abstract class Bike
{  
	  abstract void run();  
	}  