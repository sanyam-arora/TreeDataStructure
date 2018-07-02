package com.arora.tree.traversal;

import java.util.ArrayList;

import com.arora.tree.node.Node;

public class PreorderTraversal<T> {

	public void preorderTraversal(Node<T> node,
			ArrayList<Node<T>> preorderTraversalList) {
		
		if(null == node) {
			return;
		} else {
			preorderTraversalList.add(node);
		}
		
		preorderTraversal(node.getLeftChild(), preorderTraversalList);
		preorderTraversal(node.getRightChild(), preorderTraversalList);
		
	}
	
	public String printPreorderTraversal(Node<T> node) {
		ArrayList<Node<T>> preorderTraversalList = new ArrayList<Node<T>>();
		preorderTraversal(node, preorderTraversalList);
		StringBuffer printList = new StringBuffer("");
		
		for(Node<T> listNode: preorderTraversalList) {
			printList.append(listNode.getData() + " ");
		}
		
		return printList.toString();
	}
}
