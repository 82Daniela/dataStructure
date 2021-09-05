package com.dio.de.linked_list;

public class Node<T> {
	
	private T content;
	private Node<T> node;
	private int index;
	
	public T  getConteudo() {
		return content;
	}
	public void setContent(T conteudo) {
		this.content = conteudo;
	}
	public Node<T> getNode() {
		return node;
	}
	public void setNode(Node<T> node) {
		this.node = node;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public T getContent() {
		
	
		return content;
	}
	
	@Override
	public String toString() {
		return (String) this.content;
	}
	
	
	
	

}
