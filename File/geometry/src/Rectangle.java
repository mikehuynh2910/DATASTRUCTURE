/**************************************************************
* Name        : Polymorphism with Abstraction
* Author      : Sang Huynh
* Created     : 1/26/2022
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows XX
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This program overall description here
*               Input:  list and describe
*               Output: list and describe
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
interface Measurement {
	
	public double perimeter();
	public  double area();
}
public class Rectangle implements Measurement {
	double length;
	double width;
	public Rectangle( double length, double width)
	{
	       this.length=length;
	       this.width= width;
	}     
	   	public double perimeter()
		{
		return(2*length+2*width);
		}
		public double area()
		{
		return(length*width);
		}
	
}

	class Square implements Measurement
	{
	   // class variables
	   double side;

	   // Parameterize constructor
	   public Square(double side)
	   {
	       this.side=side;
	   }

	   // over-ride method from interface
	   public double perimeter()
	   {
	       return 4*this.side;
	   }

	   // over-ride method from interface
	   public double area()
	   {
	       return Math.pow(this.side,2);
	   }
	
}



