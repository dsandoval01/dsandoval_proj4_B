public class BTree{

	//Instance fields
	private BTree root;

	// Constructor
	public BTree(BTree r){
		root = r;
	}

	//Method that returns root of tree
	public char getRoot(){
		return root;
	}
	
}