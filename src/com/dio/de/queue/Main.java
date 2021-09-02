package com.dio.de.queue;

public class Main {
	
	public static void main(String[] args) {
		
		Queue<String> q = new Queue();
		
		Node<String> node1 = new Node<>();
		
		node1.setT("First Person");
		
		Node<String> node2 = new Node<>();
		
		node2.setT("Second Person");
		
		Node<String> node3 = new Node<>();
		
		node3.setT("Third person");
		
		Node<String> node4 = new Node<>();
		
		node4.setT("Fourth Person");
		
		q.enqueue(node1);
		
		q.enqueue(node2);
		
		q.enqueue(node3);
		
		q.enqueue(node4);
		
		q.dequeue();
		
		q.dequeue();
		
		
		q.printStack(q);
	
	
		
		
		
		
	
	}

}
