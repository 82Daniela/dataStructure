package com.dio.de.stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack();
		
		Node<String> node1 = new Node<>();
		
		node1.setContent("First book");
		
		s.push(node1);
		
	
		Node<String> node2 = new Node<>();
		
		node2.setContent("Second book");
		
		s.push(node2);
		
		Node<String> nodeTop = s.top().getReferencedNode();
		
		System.out.println(nodeTop);
		
		s.pop(node2);
		
		nodeTop = s.top().getReferencedNode();
		System.out.println(nodeTop);
		
		s.pop(node1);
		
		nodeTop = s.top().getReferencedNode();
		System.out.println(nodeTop);
		
		s.pop(node1);
		
		
		
	}

}
