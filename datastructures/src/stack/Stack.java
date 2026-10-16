package stack;

public class Stack {

	int stack[] = new int[5];
	int top=0;
	public void push(int data){
		if(top==stack.length) {
			System.out.println("cannot push elements");
		}
		else {
			stack[top] = data;
			top++;			
		}
	}
	
	public int pop(){
		if(isempty()) {
			System.out.println("No elements to pop");
			return -1;
		}
		else {
			top--;
			int data= stack[top];
			stack[top]=0;
			return data;
		}
		
		
	}
	
	public int peek(){
		if(top==0) {
			System.out.println("No elements to pop");
		}
		int data= stack[top-1];
		return data;	
	}
	
	public boolean isempty(){
//		if(top==0) {
//			return true;
//		}
		return top==0?true:false;
		
	}
	
	public int size(){
		return top;
	}
	
	public void show() {
		for(int n : stack) {
			System.out.print(n+" ");
		}
	}
}
