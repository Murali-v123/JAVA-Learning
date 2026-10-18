package tree;

public class Implemntingtree {

	public static void main(String[] args) {
		Binarytree tree=new Binarytree();
		tree.insert(8);
		tree.insert(7);
		tree.insert(12);
		tree.insert(15);
		tree.insert(2);
		tree.insert(5);
		
		tree.inorder();
	}

}
