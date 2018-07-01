package com.arora.tree.binaryTree;

import java.util.ArrayList;

import com.arora.tree.model.BinaryTreeNode;

public class BinaryTree<T> {

	private BinaryTreeNode<T> root = null;
	
	public BinaryTreeNode search(T data) {
		return search(root, data);
	}

	public BinaryTreeNode search(BinaryTreeNode<T> node, T data) {

		BinaryTreeNode searchedNode = null;

		if (node.getData().equals(data)) {
			return node;
		} else if (null == node.getLeftChild() && null == node.getRightChild()) {
			return null;
		}
		if (null != node.getLeftChild()) {
			searchedNode = search(node.getLeftChild(), data);
		}
		if (null != node.getRightChild() && null == searchedNode) {
			searchedNode = search(node.getRightChild(), data);
		}
		return searchedNode;
	}

	public BinaryTreeNode<T> getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode<T> root) {
		this.root = root;
	}

}
