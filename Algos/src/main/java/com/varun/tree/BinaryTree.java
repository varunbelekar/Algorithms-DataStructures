package com.varun.tree;

public interface BinaryTree {
	 BstNode insert(BstNode root, int data);
	 
	 void preOrder(BstNode root);
	 
	 void inOrder(BstNode root);
	 
	 void postOrder(BstNode root);
}
