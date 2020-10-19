class Main {
	public static void main(String args[]) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		Node node14 = binarySearchTree.insert(1);
		Node node7 = binarySearchTree.insert(2);
		Node node12 = binarySearchTree.insert(3);
		Node node5 = binarySearchTree.insert(4);
		Node node2 = binarySearchTree.insert(5);


		binarySearchTree.printInOrder();
		System.out.println(binarySearchTree.getChildNodes(node14));
		System.out.println(binarySearchTree.getChildNodes(node7));
		System.out.println(binarySearchTree.getChildNodes(node12));
		System.out.println(binarySearchTree.getChildNodes(node5));
		System.out.println(binarySearchTree.getChildNodes(node2));
	}
}