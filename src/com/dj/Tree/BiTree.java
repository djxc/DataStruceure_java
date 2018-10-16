package com.dj.Tree;

import java.util.ArrayList;
import java.util.List;

import com.dj.Stack.Stack;

public class BiTree {
	private BiNode root;
	private List<BiNode> datas;//存储所有的节点
	public BiTree(){
		root = new BiNode(null);
	}
	public BiTree(Object o){
		root = new BiNode(o);
	}
	
	public Stack createStack(Object[] os){
		Stack stack = new Stack(os.length);
		for(Object o :os){
			stack.push(o);			
		}
		return stack;
	}
	
	public void createTree(Object[] objs){		
		datas=new ArrayList<BiNode>();		
		for (Object object : objs) {			
			datas.add(new BiNode(object));		
			}		
		root=datas.get(0);//将第一个作为根节点		
		for (int i = 0; i < objs.length/2; i++) {		
			datas.get(i).setLeftNode(datas.get(i*2+1));			
			if(i*2+2<datas.size()){//避免偶数的时候 下标越界				
				datas.get(i).setRightNode(datas.get(i*2+2));			
				}		
			}			
	}
	
	
	public BiNode createTree(Stack stack){
		BiNode root = null;
		while(!stack.isEmpty()){		
			Object o = stack.pop();
			if(o!=null){				
				root = new BiNode(o);
				root.setLeftNode(createTree(stack));
				root.setRightNode(createTree(stack));
			}
		}
		return root;
	}
	
	public void insertNode(Object o){
		BiNode node = new BiNode(o);
		BiNode current = root;
		if(root.getData()==null){
			root = node;
		}else{
			while(current!=null){
				BiNode left = current.getLeftNode();
				BiNode right = current.getRightNode();
			}
			if(root.getLeftNode()!=null){
				
			}
		}
	}
	
	/**
	 * 先序遍历
	 * @param node
	 */
	public void PreOrder(BiNode node){
		if(node!=null){
			System.out.print(node.getData() + " ");
			PreOrder(node.getLeftNode());
			PreOrder(node.getRightNode());
		}else{
			System.out.print("*" + " ");
		}
	}
	
	/**
	 * 中序遍历，需要输入节点
	 * @param node
	 */
	public void InOrder(BiNode node){
		if(node!=null){
			InOrder(node.getLeftNode());
			System.out.print(node.getData() + " ");
			InOrder(node.getRightNode());
		}else{
			System.out.print("*" + " ");
		}
	}
	
	public void PostOrder(BiNode node){
		if(node!=null){
			PostOrder(node.getLeftNode());
			PostOrder(node.getRightNode());
			System.out.print(node.getData() + " ");
		}else{
			System.out.print("*" + " ");
		}
	}

	public BiNode getRoot() {
		return root;
	}

	public void setRoot(BiNode root) {
		this.root = root;
	}

	public List<BiNode> getDatas() {
		return datas;
	}

	public void setDatas(List<BiNode> datas) {
		this.datas = datas;
	}
	
	
	
}
