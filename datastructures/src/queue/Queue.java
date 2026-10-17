package queue;

public class Queue {
	int q[]=new int[5];
	int size;
	int rear;
	int front;
	public  void enqueue(int data){
		if(isfull()) {
			System.out.println("Queue is full! Cannot enqueue ");
			return;
		}
		q[(rear)%5]=data;
		size++;
		rear++;
	}
	
	public  int dequeue(){
		
		if(isempty()) {
			System.out.println("No elements to pop");
			return -1;
		}
		int data = q[front];
		front=(front+1)%5;			
		size--;
		return data;
	}
	
	public void show() {
		if (isempty()) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.print("elemnts are:");
		for(int i=0; i<size;i++) {
			System.out.print(q[(front+i)%5]+" ");
		}
		System.out.println();
	}
	
	public int getsize() {
		return size;
	}
	
	public boolean isempty() {
		return size==0;
	}

	public boolean isfull() {
		return size==5;
	}
}
