package com.dio.de.queue;

public class Node<T> {
	
	
	private T t;
	
	private Node<T> referencedNode;
	
	public Node() {
		
	}

	public Node(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public Node<T> getReferencedNode() {
		return referencedNode;
	}

	public void setReferencedNode(Node<T> referencedNode) {
		this.referencedNode = referencedNode;
	}

	@Override
	public String toString() {
		return "Node [t=" + t + "]";
	}
	
	
	

}
