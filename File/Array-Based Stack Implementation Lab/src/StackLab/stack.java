//stack
package StackLab;

public class stack {
	// Members
		private int top; 
		private int maxSize; 
		private String stackItems[]; 
		/*
		 * Default Constructor
		 */
		public stack() {
			this.maxSize = 5; 
			this.top = -1; 
			this.stackItems = new String[maxSize];
		}
		/*
		 * Parameterized 
		 */
		/**
		 * @param maxSize - sets maximum size of the stack 
		 */
		public stack(int maxSize) {
			this.maxSize = maxSize;
			this.top = -1; 
			this.stackItems = new String[maxSize];
		}
		
		/**
		 * @return
		 */
		public boolean isFull() {
			return top == maxSize -1; 
		}
		
		/**
		 * @return
		 */
		public boolean isEmpty() {
			
			return size()==0;  

		}
	   
	   /**
		 * @return
		 */
		public int size() {
			
			return top+1;  

		}
		
		/**
		 * @return
		 * @throws StackEmptyException 
		 */
		public String peek() throws StackEmptyException{
			if (! this.isEmpty()) 
				return stackItems[top];
			throw new StackEmptyException(); 
		}
		
		/**
		 * @return
		 */
		public String pop() throws StackEmptyException {
			 if (this.isEmpty()) {
		           throw new StackEmptyException();
		       }
		       String item = this.stackItems[top--];
			return item; 
		}	
		
		/**
		 * 
		 */
		public void push(String item) throws StackFullException {
		       if(this.isFull()) {
		           throw new StackFullException();
		       }
		       this.stackItems[++top]= item;
		   }
		

		
		public String printStackUp() throws StackEmptyException {
			if (this.isEmpty()) {
		           throw new StackEmptyException();}
			String stackString = new String();
			 stackString="";
		//	while(this.top!1) {
		//stackString  += stackItems[top]+"\n";
		//this.top--;}
			 for(int j= 0;j<=this.top;j++) {
				 stackString+=stackItems[j]+"\n";
			 }
			
			return stackString; 
		}    
		}
