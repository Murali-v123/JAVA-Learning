package stack;

public class Dstack {

	int capacity = 2;
	int stack[] = new int[capacity];
	int top=0;
	public void push(int data){
		if(size()==capacity) {
			expand();
		}
		
		stack[top] = data;
		top++;			
	}
	
	private void expand() {
		int length = size();
		int newstack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newstack, 0, length);
		stack = newstack;
		capacity*=2;
	}

	public int pop(){
		int data = -1;
		if(isempty()) {
			System.out.println("No elements to pop");
			return -1;
		}
		else {
			top--;
			data= stack[top];
			stack[top]=0;	
			shrink();
		}
		return data;
	}
	
	private void shrink() {
		int length = size();
		if(length<=(capacity/2)/2) {
			capacity = capacity/2;
		}
		int newstack[] = new int[capacity];
		System.arraycopy(stack, 0, newstack, 0, length);
		stack = newstack;
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
