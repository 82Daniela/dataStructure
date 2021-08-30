package com.dio.de.stack;

public class Node<T> {

	
	private T content;
	
	private Node<T> referencedNode;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public Node<T> getReferencedNode() {
		return referencedNode;
	}

	public void setNode(Node<T> node) {
		this.referencedNode = node;
	}

	@Override
	public String toString() {
		return "Node [content=" + content + "]";
	}
	
	
	
}
