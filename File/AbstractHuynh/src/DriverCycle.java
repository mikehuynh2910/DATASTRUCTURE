
public class DriverCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle Bi1=new Bicycle(2,4); //Creating object of Bicycle class
        System.out.println("Number of tyres in bicycle are: "+Bi1.numberOfTyres); //Printing value of numberOfTyres
        System.out.println("Number of flats in bicycle are: "+Bi1.numberOfFlats); //Printing value of numberOfFlats
       	Bi1.ride(); //Calling ride() method
       	Bi1.stop(); //Calling stop() method
	}

}
//Big-O: O(1)
