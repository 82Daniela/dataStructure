package com.dio.de.stack;

public class Stack<T> {

	private Node<T> topNodeReference;

	public Node<T> top() {
		return topNodeReference;
	}

	public boolean isEmpty() {

		return top() == null ? true : false;
	}

	public void push(Node<T> node) {

		if (isEmpty()) {

			topNodeReference = new Node<>();

			topNodeReference.setNode(node);

			System.out.println(top().getReferencedNode() + " successful insertion!");
		}

		else {
			node.setNode(top().getReferencedNode());

			topNodeReference.setNode(node);

			System.out.println(top().getReferencedNode() + " successful insertion!");
		}

	}

	public void pop(Node<T> node) {

		if (isEmpty() || node != top().getReferencedNode()) {
			System.out.println("Impossible remotion! Nothing to do!");
		} else {
			top().setNode(node.getReferencedNode());
			System.out.println( "successful remotion!");
		}

	}

}
