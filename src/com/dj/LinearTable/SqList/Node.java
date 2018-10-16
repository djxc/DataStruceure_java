package com.dj.LinearTable.SqList;

public class Node {
	private Node next = null;
	private Object data;
	
	public Node(Object o){
		this.data = o;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	

}
