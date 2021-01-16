package com.varun.tree;

public class BinarySearchTreeImpl implements BinarySearchTree{

	@Override
	public BstNode insert(BstNode root, int data) {
		if(root == null) {
			root = new BstNode(data);
		}else if(data <= root.data) {
			root.left = insert(root.left, data);
		}else {
			root.right = insert(root.right, data);
		}
		
		return root;
	}

	@Override
	public boolean isValidBst() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void preOrder(BstNode root) {
		if(root == null) {
			return;
		}
		preOrder(root.left);
		System.out.print(root.data + " ");
		preOrder(root.right);
	}

	@Override
	public void inOrder(BstNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		inOrder(root.left);
		inOrder(root.right);
	}

	@Override
	public void postOrder(BstNode root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	@Override
	public int mininumElement(BstNode root) {
		while(root.left != null) {
			root = root.left;
		}
		return root.data;
	}
	
}
