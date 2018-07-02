package com.arora.tree.binaryTree;

import java.util.ArrayList;

import com.arora.tree.common.Tree;
import com.arora.tree.node.Node;
import com.arora.tree.traversal.InorderTraversal;
import com.arora.tree.traversal.PostorderTraversal;
import com.arora.tree.traversal.PreorderTraversal;

public class BinaryTree<T> extends Tree<T>{

	private Node<T> root = null;
	private PreorderTraversal<T> preorderTraversal = null;
	private InorderTraversal<T> inorderTraversal = null;
	private PostorderTraversal<T> postorderTraversal = null;
	
	public BinaryTree() {
		preorderTraversal = new PreorderTraversal<T>();
		inorderTraversal = new InorderTraversal<T>();
		postorderTraversal = new PostorderTraversal<T>();
	}
	
	public ArrayList<Node<T>> inorderTraversal() {
		ArrayList<Node<T>> inorderTraversalList = new ArrayList<Node<T>>();
		inorderTraversal.inorderTraversal(getRoot(), inorderTraversalList);
		return inorderTraversalList;
	}
	
	public String printInorderTraversal() {
		return inorderTraversal.printInorderTraversal(getRoot());
	}
	
	public ArrayList<Node<T>> postorderTraversal() {
		ArrayList<Node<T>> postorderTraversalList = new ArrayList<Node<T>>();
		postorderTraversal.postorderTraversal(getRoot(), postorderTraversalList);
		return postorderTraversalList;
	}
	
	public String printPostorderTraversal() {
		return postorderTraversal.printPostorderTraversal(getRoot());
	}
	
	public ArrayList<Node<T>> preorderTraversal() {
		ArrayList<Node<T>> preorderTraversalList = new ArrayList<Node<T>>();
		preorderTraversal.preorderTraversal(getRoot(), preorderTraversalList);
		return preorderTraversalList;
	}
	
	public String printPreorderTraversal() {
		return preorderTraversal.printPreorderTraversal(getRoot());
	}

	public Node search(T data) {
		return search(root, data);
	}

	public Node search(Node<T> node, T data) {

		Node searchedNode = null;

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

	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}
	
	public void setRoot(T data) {
		this.root = new Node(data);
	}
	
	
}
