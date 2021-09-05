package com.dio.de.linked_list;

public class Main {

	public static void main(String[] args) {

		Linked_list<String> ll = new Linked_list<>();

		Node<String> node = new Node<>();

		node.setContent("First Node");

		int x = ll.add(0, node);
		
		

		Node<String> node2 = new Node<>();

		node2.setContent("second Node");

		x = ll.add(0, node2);
		
		

		Node<String> node3 = new Node<>();

		node3.setContent("third Node");

		ll.add(1, node3);
		
		
		
		Node<String> node4 = new Node<>();

		node4.setContent("fourth Node");

		ll.add(1, node4);
		
		
		Node<String> node5 = new Node<>();

		node5.setContent("fifth Node");

		ll.add(node5);
		
		

		

	}

}
