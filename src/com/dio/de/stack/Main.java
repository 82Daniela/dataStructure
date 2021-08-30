package com.dio.de.stack;

public class Main {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		Node<String> node1 = new Node<>();
		
		node1.setContent("First book");
		
		s.push(node1);
		
	
		Node<String> node2 = new Node<>();
		
		node2.setContent("Second book");
		
		s.push(node2);
		
		Node<String> node3 = new Node<>();
		
		node3.setContent("Third book");
		
		s.push(node3);
		
		s.pop(node2);
		
		s.pop(node3);
		
		System.out.print(s.top());
		
	}

}
