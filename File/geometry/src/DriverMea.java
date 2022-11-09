
public class DriverMea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle rec1 =new Rectangle(6,8);

	       // print parameter and area of rectangle
	       System.out.println("Perimeter of rectangle: "+rec1.perimeter());
	       System.out.println("Area of rectangle: "+ rec1.area());

	       // create an object for Rectangle
	       Square square=new Square(5);

	       // print parameter and area of square
	       System.out.println("Perimeter of square: "+square.perimeter());
	       System.out.println("Area of square: "+square.area());
	   }
	}
//Big-O: o(1)

