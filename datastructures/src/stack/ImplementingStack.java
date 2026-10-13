package stack;

public class ImplementingStack {

	public static void main(String args[]) {
		
		Stack arr = new Stack();
		arr.push(12);
		arr.push(43);
		arr.push(22);
		arr.show();
		arr.pop();
		System.out.println();
		arr.show();
	}
}
