package abstract1;

public class Abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle1();
		s.draw();  
	}

}
abstract class Shape
{  
      abstract void draw();  
}  
 
class Rectangle extends Shape
   {  
     void draw()
     {
    	 System.out.println("drawing rectangle");
    	 }  
   }  
class Circle1 extends Shape
    {  
         void draw()
         {
        	 System.out.println("drawing circle");
         }  
    }  