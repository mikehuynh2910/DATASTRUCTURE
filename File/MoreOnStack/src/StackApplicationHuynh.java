import java.util.Scanner;
import java.util.Stack;
import java.io.*;
public class StackApplicationHuynh {
/*	Stack postfixStack = new Stack(); 
	postfixStack.push("A");
	String item = postfixStack.pop();*/

    //function to set precedence
    static int priority(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    //function that converts infix to postfix
  public static String infixToPostFix(String expression){

        String re = "";
        //character stack declaration
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <expression.length() ; i++) {
            char c = expression.charAt(i);

            //check for operator
            if(priority(c)>0){
                while(stack.isEmpty()==false && priority(stack.peek())>=priority(c)){
                    re += stack.pop();
                }
                stack.push(c);
            }else if(c==')'){
                char x = stack.pop();
                while(x!='('){
                    re += x;
                    x = stack.pop();
                }
            }
            else if(c=='('){
                stack.push(c);
            }
            else{
                //character is neither operator nor (
                re += c;
            }
        }
        for (int i = 0; i <=stack.size() ; i++) {
            re += stack.pop();
        }
        return re;
    }

   public static void main(String[] args) {
        String expression;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Infix Expression: ");
        expression=sc.nextLine();
        System.out.println("Infix Expression: " + expression);
        System.out.println("Postfix Expression: " + infixToPostFix(expression));}
  
}

	

	