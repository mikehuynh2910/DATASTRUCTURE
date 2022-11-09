
public class callStackHuynh {

	
	//d3fine method1
	static void method1()
	{
	System.out.println("In method1");
	System.out.println("Exiting method1");
	}
	//d3fine method2
	static void method2()
	{
	System.out.println("In method2");
	System.out.println("Exiting method2");
	}
	//d3fine method3
	static void method3()
	{
	System.out.println("In method3");
	System.out.println("Exiting method3");
	}
	//d3fine method4
	static void method4()
	{
	System.out.println("In method4");
	System.out.println("Exiting method4");
	}
	//driver function
	   public static void main(String[] args)
	   {
	       System.out.println("In main method" );
	       //call method1
	       method1();
	       //call method2
	       method2();
	       //call method3
	       method3();
	       //call method3
	       method4();
	      
	   System.out.println("Exiting main" );
	   }
	}

