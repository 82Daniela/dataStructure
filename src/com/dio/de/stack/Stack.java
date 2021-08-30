package com.dio.de.stack;

public class Stack {
	
	
	private Node<String> topNodeReference;
	
	
	public boolean isEmpty() {
		
		return this.topNodeReference == null ? true : false;
	}


	public Node<String> top() {
		return this.topNodeReference;
	}
	
	public void push(Node<String> node) {
		
		if(isEmpty()) {
			this.topNodeReference = node;
		}
		
		node.setNode(this.topNodeReference);
		
		this.topNodeReference=node;
	}
	
	public void pop(Node<String> node){
		
		Node<String> topNode = top();
		
		if(isEmpty() || node!= topNode) {
			
			System.out.println("Remotion impossible! Nothing to do!");
			
		}
		
		else {
			
			this.topNodeReference = topNode.getReferencedNode();
		
			
		}
		
		
		
		
		
	}
	
	
	
	
}

