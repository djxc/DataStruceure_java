package com.dj.LinearTable.SqList;

public class LinkList {
	private int size = 0;
	private Node head;
	private Node local;
	
	public LinkList(){
		head = new Node("head");
		local = head;
	}
	
	/**
	 * 添加节点，改变local的值指向插入的节点，将size加一
	 * @param node
	 */
	public void addNode(Node node){
		local.setNext(node);
		local = node;
		this.size++;
	}
	
	/**
	 * 打印连接线性表的各个元素
	 * 遍历连接表，输出每个节点的data
	 */
	public void printLinkList(){
		Node next = this.head.getNext();
		while(next!=null){
			System.out.print(next.getData() + " ");
			next = next.getNext();
		}
		System.out.println();
	}

	/**
	 * 获取指定节点的data
	 * 通过给定index，然后遍历链表得到第index节点返回data
	 * 如果index<0或大于size输出越界提示，返回null
	 * @param index
	 * @return
	 */
	public Object getDataByIndex(int index){
		Node n = getNodeByIndex(index);		
		if(n!=null){				
			return n.getData();
		}else{
			System.out.println("index越界");
			return null;
		}
	}
	
	/**
	 * 插入节点
	 * 通过给定位置将节点插入
	 * @param node
	 * @param index
	 */
	public void insertNode(Node node, int index){
		Node n = getNodeByIndex(index-1);		
		if(n!=null){
			node.setNext(n.getNext());
			n.setNext(node);
			this.size++;
		}else{
			System.out.println("index越界,插入失败");
		}		
	}
	
	public void deleteNode(int index){
		if(index<=size){			
			Node node = getNodeByIndex(index-1);
			if(node!=null){			
				Node loc = node.getNext();
				node.setNext(loc.getNext());
				this.size--;
			}else{
				System.out.println("index越界,删除失败！");
			}
		}else{
			System.out.println("index越界,删除失败！");
		}
	}
	
	/**
	 * 获取指定位置的node
	 * @param index
	 * @return
	 */
	public Node getNodeByIndex(int index){
		if(index>0 && index<=size){	
			Node next = this.head.getNext();
			int i = 1;
			while(next!=null && i < index){
				next = next.getNext();
				i++;
			}
			return next;
		}else{			
			return null;
		}
	}
	
	public int getSize() {
		return size;
	}
	
}
