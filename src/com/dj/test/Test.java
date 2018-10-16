package com.dj.test;


import java.util.Arrays;

import com.dj.LinearTable.MyArray;
import com.dj.LinearTable.SqList.LinkList;
import com.dj.LinearTable.SqList.Node;
import com.dj.LinearTable.SqList.SqList;
import com.dj.Stack.LinkStack;
import com.dj.Stack.Stack;
import com.dj.Tree.BiNode;
import com.dj.Tree.BiTree;
import com.dj.search.MySearch;
import com.dj.sort.MySort;

public class Test {
	public static void main(String[] args) {
//		testSqList();
//		testLinkList();
//		testStack();
//		testLinkStack();
//		testTree();
//		testSort();
		testSearch();
	}
	
	public static void testSearch() {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 9, 15, 20};
		MySearch search = new MySearch();
//		System.out.println(search.SeqSearch(array, 7));
		System.out.println(search.BinSearch(array, 8));
	}
	
	public static void testSort() {
		int[] array = {9, 4, 1, 5, 6, 3, 2, 7, 8, 6};
		MySort insertSort = new MySort();
		
		System.out.println(Arrays.toString(array));
//		insertSort.DirInsertsort(array);
//		insertSort.BubbleSort(array);
//		insertSort.FastSort(array, 0, array.length-1);
		insertSort.SelectSort(array);
		System.out.println(Arrays.toString(array));		
	}
	
	public static void testTree(){
//		Object[] os = new Object[] {"A", "B", "C", null, null, null, "D", "E",
//				null, "F", null, null, "G", null, null};
		Object[] os = new Object[] {"A", "B", null, null, "C", null, null};
		BiTree tree = new BiTree();
		Stack stack = tree.createStack(os);
		stack.display();
		BiNode root = tree.createTree(stack);
		
//		BiTree tree = new BiTree("A");
//		BiNode left = new BiNode("B");
//		BiNode right = new BiNode("C");
//		tree.getRoot().setLeftNode(left);	
//		tree.getRoot().setRightNode(right);
//		left.setLeftNode(new BiNode("D"));
//		left.setRightNode(new BiNode("E"));
		
		tree.PreOrder(root);
		System.out.println();
		tree.InOrder(root);
		
	}
	
	public static void testLinkStack(){
		LinkStack linkstack = new LinkStack();
		for (int i=0;i<10;i++){
			linkstack.push(i);
		}
		linkstack.display();
		System.out.println(linkstack.size());
		for (int i=0;i<8;i++){
			System.out.print(linkstack.pop() + " ");
		}
		System.out.println();
		System.out.println(linkstack.size());
	}
	
	public static void testStack(){
		Stack stack = new Stack(10);
		for (int i=0;i<10;i++){
			stack.push(i);
		}
		stack.display();
		System.out.println(stack.size());
		for (int i=0;i<10;i++){
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
		System.out.println(stack.size());
	}
	
	public static void testArray(){
		MyArray myarray = new MyArray(10);
		myarray.display();
		myarray.insert("dj");
		myarray.insert("xc");
		myarray.display();
		System.out.println(myarray.contains("dj"));
		System.out.println(myarray.delete("xc"));
		myarray.display();
	}
	
 	public static void testLinkList(){
		LinkList linkList = new LinkList();
		Node first = new Node("first");
		Node f1 = new Node("seconde");
		linkList.addNode(first);
		linkList.addNode(f1);
		linkList.insertNode(new Node("thired"), 3);
		linkList.printLinkList();
		linkList.deleteNode(4);
		linkList.printLinkList();
		System.out.println(linkList.getSize());
		System.out.println(linkList.getDataByIndex(3));
	}
	
	public static void testSqList(){
		SqList sqlist = new SqList(10);
		sqlist.setSqList(0, "dj");
		sqlist.setSqList(1, "xc");
		sqlist.setSqList(2, "xz");
		sqlist.setSqList(3, "ww");
		SqList sqlist2 = new SqList(new Object[]{"a", "b", "c"});
		sqlist2.printSqList();
		SqList tosqlist = new SqList(10);
		tosqlist.mergeList(sqlist, sqlist2, tosqlist);
		tosqlist.printSqList();
//		sqlist.printSqList();
//		sqlist.insertSqList(3, "god");
//		sqlist.printSqList();
//		sqlist.deleteSqList(0);
//		sqlist.printSqList();
//		System.out.println(sqlist.findElement("xc1"));
	}
}
