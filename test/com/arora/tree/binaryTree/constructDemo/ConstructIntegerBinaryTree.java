package com.arora.tree.binaryTree.constructDemo;

import com.arora.tree.binaryTree.BinaryTree;
import com.arora.tree.model.BinaryTreeNode;

public class ConstructIntegerBinaryTree<T> {

	public static BinaryTree<Integer> construct(){
	
		BinaryTree<Integer> binaryIntegerTree = new BinaryTree<Integer>();
	
		binaryIntegerTree.setRoot(new Integer(1));
		binaryIntegerTree.getRoot().setLeftChild(new Integer(2));
		binaryIntegerTree.getRoot().setRightChild(new BinaryTreeNode<Integer>(3));
		binaryIntegerTree.getRoot().getLeftChild().setLeftChild(new Integer(4));
		binaryIntegerTree.getRoot().getRightChild().setRightChild(new BinaryTreeNode<Integer>(5));
		binaryIntegerTree.getRoot().getLeftChild().setRightChild(new BinaryTreeNode<Integer>(6));
		binaryIntegerTree.getRoot().getRightChild().setLeftChild(new BinaryTreeNode<Integer>(7));
		
		return binaryIntegerTree;
	}

}
