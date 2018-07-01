package com.arora.tree.model;

public class BinaryTreeNode<T> {

	private BinaryTreeNode rightChild;

	private BinaryTreeNode leftChild;

	private T data;

	public BinaryTreeNode(T data) {
		this.data = data;
		rightChild = leftChild = null;
	}

	public BinaryTreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public void setRightChild(T data) {
		BinaryTreeNode<T> node = new BinaryTreeNode<T>(data);
		this.leftChild = node;
	}

	public BinaryTreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public void setLeftChild(T data) {
		BinaryTreeNode<T> node = new BinaryTreeNode<T>(data);
		this.leftChild = node;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
