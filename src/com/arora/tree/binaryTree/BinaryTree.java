package com.arora.tree.binaryTree;

import java.util.ArrayList;

import com.arora.tree.binaryTree.traversal.InorderTraversal;
import com.arora.tree.binaryTree.traversal.PostorderTraversal;
import com.arora.tree.binaryTree.traversal.PreorderTraversal;
import com.arora.tree.model.BinaryTreeNode;

public class BinaryTree<T> {

	private BinaryTreeNode<T> root = null;
	private PreorderTraversal<T> preorderTraversal = null;
	private InorderTraversal<T> inorderTraversal = null;
	private PostorderTraversal<T> postorderTraversal = null;
	
	public BinaryTree() {
		preorderTraversal = new PreorderTraversal<T>();
		inorderTraversal = new InorderTraversal<T>();
		postorderTraversal = new PostorderTraversal<T>();
	}
	
	public ArrayList<BinaryTreeNode<T>> inorderTraversal() {
		ArrayList<BinaryTreeNode<T>> inorderTraversalList = new ArrayList<BinaryTreeNode<T>>();
		inorderTraversal.inorderTraversal(getRoot(), inorderTraversalList);
		return inorderTraversalList;
	}
	
	public String printInorderTraversal() {
		return inorderTraversal.printInorderTraversal(getRoot());
	}
	
	public ArrayList<BinaryTreeNode<T>> postorderTraversal() {
		ArrayList<BinaryTreeNode<T>> postorderTraversalList = new ArrayList<BinaryTreeNode<T>>();
		postorderTraversal.postorderTraversal(getRoot(), postorderTraversalList);
		return postorderTraversalList;
	}
	
	public String printPostorderTraversal() {
		return postorderTraversal.printPostorderTraversal(getRoot());
	}
	
	public ArrayList<BinaryTreeNode<T>> preorderTraversal() {
		ArrayList<BinaryTreeNode<T>> preorderTraversalList = new ArrayList<BinaryTreeNode<T>>();
		preorderTraversal.preorderTraversal(getRoot(), preorderTraversalList);
		return preorderTraversalList;
	}
	
	public String printPreorderTraversal() {
		return preorderTraversal.printPreorderTraversal(getRoot());
	}

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
	
	public void setRoot(T data) {
		this.root = new BinaryTreeNode(data);
	}
	
	
}
