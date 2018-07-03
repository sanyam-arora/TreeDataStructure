package com.arora.tree.binarySearchTree;

import com.arora.tree.common.Tree;
import com.arora.tree.node.Node;

public class BinarySearchTree<T> extends Tree<T> {
	
	private Node root;

	public void insert(T value) {
		insert(root, new Node(value));
	}
	
	public Node insert(Node current, Node node) {
		if(current == null) {
			return node;
		} else {
			if(current.getData().compareTo(node.getData()) == 0) {
				current.setLeftChild( insert(current.getLeftChild(), node) );
			} else if (current.getData().compareTo(node.getData()) == 0) {
				current.setRightChild( insert(current.getRightChild(), node));
			}
		}
		return current;
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void setRoot(T value) {
		this.root = new Node(value);
	}
}
