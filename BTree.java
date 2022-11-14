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

}