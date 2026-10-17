package queue;

public class ImpemetingQueue {

	public static void main(String[] args) {
		Queue q= new Queue();
		q.enqueue(12);
		q.enqueue(22);
		q.enqueue(32);
		System.out.println(q.dequeue());
		q.show();
		System.out.println("Geeting queue size:"+q.getsize());
		System.out.println("Geeting queue empty or not:"+q.isempty());
		System.out.println("Geeting queue full or not:"+q.isfull());
	}

}
