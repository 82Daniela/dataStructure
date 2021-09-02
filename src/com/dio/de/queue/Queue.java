package com.dio.de.queue;

import javax.management.QueryEval;

public class Queue<T> {

	private Node<T> nodeIn = new Node<>();

	public Node<T> getNodeIn() {
		return nodeIn;
	}

	public boolean isEmpty() {
		return nodeIn.getReferencedNode() == null ? true : false;
	}

	public void enqueue(Node<T> node) {

		if (isEmpty()) {

			nodeIn.setReferencedNode(node);

		} else {

			node.setReferencedNode(nodeIn.getReferencedNode());
			nodeIn.setReferencedNode(node);

		}

	}

	public int dequeue() {

		Node<T> node = nodeIn.getReferencedNode();

		Node<T> father = new Node<>();

		if (isEmpty()) {

			System.out.println("Remotion impossible! Nothing to do!");

			return -1;

		}

		else {

			if (node.getReferencedNode() == null) {

				System.out.println(node + " removed!");

				nodeIn.setReferencedNode(null);
				node = null;
				return 0;

			}

			else {

				while (node.getReferencedNode() != null) {

					father = node;
					node = node.getReferencedNode();

					if (node.getReferencedNode() == null) {

						System.out.println(node + " removed!");

						father.setReferencedNode(null);
						break;
					}

				}
			}

		}

		return 0;

	}
	
	public void printStack(Queue<T> q) {
		
		Node<T> node = q.getNodeIn().getReferencedNode();
		
		Queue<T> qHelper = new Queue<>();
		
		if(q.isEmpty()) {
			
			System.out.println("Queue is empty! Nothing to do!");
		}
		
		else {
			
			if(node.getReferencedNode()!=null) {
				qHelper.nodeIn.setReferencedNode(node.getReferencedNode());
				printStack(qHelper);
				System.out.println(node);
			}
			else {
				System.out.println(node);
			}
			
		}
		
		
	}

	
}
