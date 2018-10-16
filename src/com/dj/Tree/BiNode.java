package com.dj.Tree;

public class BiNode {
	private Object data;
	private BiNode leftNode;
	private BiNode rightNode;
	
	public BiNode(Object o){
		this.data = o;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public BiNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BiNode leftNode) {
		this.leftNode = leftNode;
	}

	public BiNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(BiNode rightNode) {
		this.rightNode = rightNode;
	}
	
	
	
}
