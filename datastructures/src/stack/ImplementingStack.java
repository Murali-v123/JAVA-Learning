package stack;

public class ImplementingStack {

	public static void main(String args[]) {
		
//		Stack arr = new Stack();
		Dstack arr = new Dstack();
//		arr.push(12);
//		arr.show();
//		System.out.println();
//		arr.push(43);
//		arr.show();
//		System.out.println();
		arr.push(43);
		arr.show();
		System.out.println();
		arr.push(43);
		arr.push(43);
		arr.show();
		System.out.println();
//		System.out.println(arr.peek());
//		arr.push(22);
//		System.out.println(arr.peek());
//		arr.show();
//		System.out.println();
		System.out.println(arr.pop());
		System.out.println(arr.pop());
//		System.out.println();
		arr.show();
//		System.out.println();
//		System.out.println(arr.size());
//		System.out.println(arr.isempty());
	}
}
