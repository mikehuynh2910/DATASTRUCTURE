/**************************************************************
* Name        : Superclass
* Author      : Sang Huynh
* Created     : 1/19/2022
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
public class DerivedClothingHuynh
{
   String color ;
   String size  ;
   String slee; 
   

 public DerivedClothingHuynh(String size, String color, String slee) {
	// TODO Auto-generated constructor stub
     this.color = color;
     this.size = size;
     this.slee = slee;
}
//Include methods wash() and hang()
   public void wash(String inst) {
	   System.out.println( "Pant dry clean only.");
}
   public void hang()
   {
	   System.out.println( "Hanging Pant the clothesr");

   }
}

class Pants extends DerivedClothingHuynh
{

	public Pants(String color, String size) {
		super(color, size, null);
	}

	public String getSize() {
        return this.size;
}
	public void setSize(String size) {
        this.size = size;
}
	public String getColor() {
        return this.color;
}

	public void setColor(String color) {
        this.color = color;
	} 
	//toString() method to display class object.
	public String toString() {
	    return "Clothing [size: " + this.size +", color: "+ this.color +"]";
	}
}

  class Shirt extends DerivedClothingHuynh{
public Shirt(String color, String size,String slee )
   {
       super(color, size, slee);
       
      
   }
   public void setSize(String size) {
		// TODO Auto-generated method stub
	       this.size = size;

	} 
   public String getSize() {
       return this.size;
}

   public void setColor(String color) {
       this.color = color;
	}
   
	public String getColor() {
       return this.color;
}
	public void setSle(String slee) {
	       this.slee = slee;
		}
	
	public String getSle() {
	       return this.slee;
	}

	
		

	
	//toString() method to display class object.
	public String toString() {
	    return "Clothing [size: " + this.size +", color: "+ this.color +" , "+ "Sleeves:"+this.slee + " ]";
	}
	public void wash(String inst) {
		   System.out.println( "Shirt dry clean only.");
	}
	   public void hang()
	   {
		   System.out.println( "Hanging Shirt the clothesr");

	   }
	}

   
