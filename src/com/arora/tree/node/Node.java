package com.arora.tree.node;

public class Node<T extends Comparable<? super T>> {

	private Node rightChild;

	private Node leftChild;

	private T data;

	public Node(T data) {
		this.data = data;
		rightChild = leftChild = null;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	public void setRightChild(T data) {
		Node<T> node = new Node<T>(data);
		this.leftChild = node;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public void setLeftChild(T data) {
		Node<T> node = new Node<T>(data);
		this.leftChild = node;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
