package linked_list;
public class linkedlist {
	
    private Node head;
//    private Node tail;
    private static class Node{
    	int data;
    	Node next;
    	Node(int data){
    		this.data=data;
    		this.next=null;
    	}
    }
    public void insert(int data) {
    	Node newNode=new Node(data);
    	if(head==null) {
    		head=newNode;
    	}
    	else {
    		Node current=head;
    		while(current.next!=null) {
    			current=current.next;
    		}
    		current.next=newNode;
    	}
    }
    public void display() {
    	Node current=head;
    	while(current!=null) {
    		System.out.println(current.data);
			current=current.next;
		}
    	
    }
    
    public void insertAthead(int data) {
    	Node newNode=new Node(data);
//    	newNode.data=data;
//    	newNode.next=null;
    	newNode.next=head;
    	head=newNode;
    	if(head==null) {
    		head=newNode;
    	}
    }
    
    public void insertAt(int index,int data) {
    	Node newNode=new Node(data);
    	newNode.data=data;
    	newNode.next=null;
    	
    	Node n = head;
    	for(int i=0 ;i<index-1;i++) {
    		n=n.next;
    	}
    	newNode.next=n.next;
    	n.next = newNode;
    }
    
    
	public static void main(String args[]) {
		linkedlist list = new linkedlist();
		list.insert(23);
		list.insert(43);
		list.insert(53);
		list.insert(89);
		list.insert(56);
		list.insert(356);
		list.insertAthead(344);
		list.insertAt(3,9000);
		list.display();
		
	}
}
    
