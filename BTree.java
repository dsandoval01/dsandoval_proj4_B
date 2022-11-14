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


}