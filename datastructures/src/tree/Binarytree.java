package tree;

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data=data;
	}
}

public class Binarytree {
	
	Node root;
	
	public void insert(int data) {
		root=insertroot(root,data);
	}

	public Node insertroot(Node root, int data) {
		if(root==null) {
			root=new Node(data);
		}
		else if(data<root.data) {
			root.left=insertroot(root.left,data);
		}
		else{
			root.right=insertroot(root.right,data);
		}
		return root;
	}
	
	public void inorder() {
		System.out.println("Elements are:");
		inorderrec(root);
	}

	public void inorderrec(Node root) {
		if(root!=null) {
			inorderrec(root.left);
			System.out.print(root.data+" ");
			inorderrec(root.right);
		}
	}
}
