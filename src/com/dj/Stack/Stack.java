package com.dj.Stack;

public class Stack {
	private Object[] data = null;
	private int size = 0;
	private int MaxSize;
	
	
	public Stack(int max)
	{
		data = new Object[max];
		this.MaxSize = max;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public boolean isFull(){
		return size == MaxSize;
	}
	
	/**
	 * 进栈，存入元素
	 * @param o
	 */
	public void push(Object o){
		if(!isFull()){			
			data[size++] = o;
		}else{
			System.err.println("对不起,栈已满,无法入栈");
		}
	}
	
	public Object pop(){
		if(!isEmpty()){
			size--;
			return data[size];			
		}else{
			return null;
		}
	}
	
	public Object getTop(){
		if(!isEmpty()){
			return data[size];			
		}else{
			return null;
		}
	}
	
	public void display(){
		for(int i=0;i<size;i++){
			System.out.print(data[i] + " ");			
		}
		System.out.println();
	}
	
	public int size(){
		return size;
	}
	
}
