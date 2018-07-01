package com.arora.tree.binaryTree;

import java.util.ArrayList;

import com.arora.tree.model.BinaryTreeNode;

public class BinaryTree<T> {
	
	BinaryTreeNode<T> root = null;
	
	//searching for a particular node
	public BinaryTreeNode search(BinaryTreeNode<T> node, T data) {
		
		BinaryTreeNode searchedNode = null;
		
		if(node.getData().equals(data)) {
			return node;
		} else if (null == node.getLeftChild() && null == node.getRightChild()) {
			return null;
		}
		if(null != node.getLeftChild()) {
			searchedNode =  search(node.getLeftChild(), data);
		}
		if(null != node.getRightChild() && null == searchedNode) {
			searchedNode = search(node.getRightChild(), data);
		}
		return searchedNode;
	}
	
}
