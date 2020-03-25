class Node { 
	int data; 
	Node left, right; 

	Node(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

class BoundaryTraversal { 
	Node root; 

	void printLeaves(Node node) {
        if(node == null) {
            return;
        }

        printLeaves(node.left);
        if(node.left == null && node.right == null) {
            System.out.print(node.data + ' ');
        }
        printLeaves(node.right);
	} 

    void printBoundaryLeft(Node node) 	{ 
        if(node == null) {
            return;
        }

        System.out.print(node.data + ' ');
        if(node.left != null) {
            printBoundaryLeft(node.left);
        }
        else if(node.right != null) {
            printBoundaryLeft(node.right);
        }
	} 

	void printBoundaryRight(Node node) 	{ 
        if(node == null) {
            return;
        }

        System.out.print(node.data + ' ');
        if(node.right != null) {
            printBoundaryRight(node.right);
        }
        else if(node.left != null) {
            printBoundaryRight(node.left);
        }
	} 

	void printBoundary(Node node) { 
        if(node == null) {
            return;
        }

        System.out.print(node.data + ' ');
        printBoundaryLeft(node.left);

        printLeaves(node.left);
        printLeaves(node.right);

        printBoundaryRight(node.right);
	} 

	// Driver program to test above functions 
	public static void main(String args[]) 
	{ 
		BoundaryTraversal tree = new BoundaryTraversal(); 
		tree.root = new Node(20); 
		tree.root.left = new Node(8); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(12); 
		tree.root.left.right.left = new Node(10); 
		tree.root.left.right.right = new Node(14); 
		tree.root.right = new Node(22); 
		tree.root.right.right = new Node(25); 
		tree.printBoundary(tree.root); 
	} 
} 
