
public class LLStackDriver {
	   public static void main(String[] args) {
	          
		   	   LLStack m = new LLStack();
	           m.push("CLASS");
	           m.push("JAVA");
	           m.push("C++");
	           System.out.println("size of stack: " + m.size());
	           System.out.println("printing the stack: " );
	           m.printStackDown();
	           System.out.println("pop the stack" );
	           m.pop();
	           m.push("Grade");
	           System.out.println("printing the stack: " );
	           m.printStackDown();
	           System.out.println("pop the stack" );
	           m.pop();
	           System.out.println("pop the stack" );
	           m.pop();
	           System.out.println("printing the stack: " );
	           m.printStackDown();
	           System.out.println("pop the stack" );
	           m.pop();
	           System.out.println("pop the last" );
	           m.pop();
	   }
	}

