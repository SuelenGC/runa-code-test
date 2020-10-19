class BinarySearchTree {
	Node root;

	public Node insert(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
		} else {
			insert(root, newNode);
		}

		return newNode;
	}

	private void insert(Node tree, Node newNode) {
		if (tree.value == newNode.value) return;

		if (newNode.value > tree.value) {
			if (tree.right == null) {
				tree.right = newNode;
			} else {
				insert(tree.right, newNode);
			}
		} else {
			if (tree.left == null) {
				tree.left = newNode;
			} else {
				insert(tree.left, newNode);
			}
		}
	}

	public int getChildNodes() {
		return getChildNodes(root);
	}

	public int getChildNodes(Node node) {
		if (node == null) return 0;
		if (node.left == null && node.right == null) return 0;

		int childNodes = 0;
		if (node.left != null) childNodes++;
		if (node.right != null) childNodes++;

		return childNodes + getChildNodes(node.left) + getChildNodes(node.right);
	}

	public void printInOrder() {
		System.out.println("\nIn order:");
		inOrder(root);
	}

	private void inOrder(Node tree) {
		if (tree == null) return;
		inOrder(tree.left);
		System.out.println(tree.value);
		inOrder(tree.right);
	}
}