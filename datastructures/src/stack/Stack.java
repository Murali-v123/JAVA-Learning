package stack;

public class Stack {

	int stack[] = new int[5];
	int top=0;
	public void push(int data){
		if(top==stack.length) {
			System.out.println("cannot push elements");
		}
		stack[top] = data;
		top++;
	}
	
	public void pop(){
		if(top==0) {
			System.out.println("No elements to pop");
		}
		top--;
		int data= stack[top];
		stack[top]=0;
		
	}
	
	public void show() {
		for(int n : stack) {
			System.out.print(n+" ");
		}
	}
}
