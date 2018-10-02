package com.dj.Stack;

import com.dj.LinearTable.SqList.Node;

public class LinkStack {
	private Node head;
	private int size;
	
	public LinkStack(){
		head = new Node(null);
		size = 0;
	}
	
	public void push(Object o){
		Node node = new Node(o);
		if(!isEmpty()){
			node.setNext(head.getNext());
		}
		head.setNext(node);
		size++;
	}
	
	public Object pop(){
		if(!isEmpty()){			
			Node node = head.getNext();
			if(node.getNext()!=null){
				head.setNext(node.getNext());
			}else{
				head.setNext(null);				
			}
			size--;
			return node.getData();
		}else{
			return null;
		}
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void display(){
		Node local = head;
		while(local.getNext()!=null){
			local = local.getNext();
			System.out.print(local.getData() + " ");
		}
		System.out.println();
	}
	
	public int size(){
		return size;
	}
	
	
}
