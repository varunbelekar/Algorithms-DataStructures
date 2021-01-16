package com.varun.tree;

public class BinaryTreeDriver {
	public static void main(String[] args) {
		BstNode root = createBST();
		
		BinarySearchTree searchTree = new BinarySearchTreeImpl();
		System.out.println("PreOrder Traversal");
		searchTree.preOrder(root);
		
		System.out.println("InOrder Traversal");
		searchTree.inOrder(root);
		
		System.out.println("PostOrder Traversal");
		searchTree.postOrder(root);
	}

	private static BstNode  createBST() {
		BstNode root = null;
		BinarySearchTree searchTree = new BinarySearchTreeImpl();
		root = searchTree.insert(root, 10);
		root = searchTree.insert(root, 6);
		root = searchTree.insert(root, 11);
		root = searchTree.insert(root, 8);
		return root;
	}
}
