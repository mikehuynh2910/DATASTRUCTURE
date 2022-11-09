/**************************************************************
* Name        : Abstraction
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


public abstract class Cycle {

	public Cycle(int numT,int numF) {
		// TODO Auto-generated constructor stub
		 numberOfTyres=numT;
	     numberOfFlats=numF;       
	}
	public int numberOfTyres,numberOfFlats; //Declaring variabkes
    abstract void ride(); //Declaring abstract method ride()
    abstract void stop(); //Declaring abstract method stop()
}
class Bicycle extends Cycle{ //child class Bicycle which extends Cycle
	Bicycle(int numT,int numF){ //Bicycle Constructor
    
        super(numT,numF);    }
    void ride(){  //ride() method
    
        System.out.println("Bicycle has started riding on street");
    }
    void stop(){ //stop() method  
        System.out.println("Bicycle has stopped at Warning Sign.");
    }
}