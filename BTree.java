public class BTree{

	//Instance fields
	private TNode root;

	// Constructor
	public BTree(TNode r){
		root = r;
	}

	//Method that returns root of tree
	public TNode getRoot(){
		return root;
	}	

	//add root
	public void addRoot(TNode e){
		 root=e;
	}

	public void attach(TNode root, TNode l, TNode r){
		root.left=l;   //assigning to right of root
		root.right=r;   //assigning to left of root
		l=null;   //making equal to null in stack
		r=null;   //making equal to null in stack

	}

	//postOrder(BSTNode v)
	// Prints out the keys of the tree in a postorder traversal
	public void postOrder(TNode v){
		if(v.left()!=null){
			postOrder(v.left());
		}
		if(v.right()!=null){
			postOrder(v.right());
		}
		System.out.println(v.e());
	
	}


}