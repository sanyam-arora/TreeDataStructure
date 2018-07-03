package com.arora.tree.construct;

import com.arora.tree.binaryTree.BinaryTree;
import com.arora.tree.node.Node;

public class ConstructIntegerBinaryTree<T> {

	public static BinaryTree<Integer> construct(){
	
		BinaryTree<Integer> binaryIntegerTree = new BinaryTree<Integer>();
	
		binaryIntegerTree.setRoot(new Integer(1));
		binaryIntegerTree.getRoot().setLeftChild(new Integer(2));
		binaryIntegerTree.getRoot().setRightChild(new Node<Integer>(3));
		binaryIntegerTree.getRoot().getLeftChild().setLeftChild(new Integer(4));
		binaryIntegerTree.getRoot().getRightChild().setRightChild(new Node<Integer>(5));
		binaryIntegerTree.getRoot().getLeftChild().setRightChild(new Node<Integer>(6));
		binaryIntegerTree.getRoot().getRightChild().setLeftChild(new Node<Integer>(7));
		binaryIntegerTree.getRoot().getRightChild().getLeftChild().setLeftChild(new Node<Integer>(8));

		
		return binaryIntegerTree;
	}

}
