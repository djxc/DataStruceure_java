package com.dj.test;

import com.dj.LinearTable.MyArray;
import com.dj.LinearTable.SqList.LinkList;
import com.dj.LinearTable.SqList.Node;
import com.dj.LinearTable.SqList.SqList;

public class Test {
	public static void main(String[] args) {
//		testSqList();
		testLinkList();
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
