package com.dj.test;

import com.dj.LinearTable.MyArray;
import com.dj.LinearTable.SqList.SqList;

public class Test {
	public static void main(String[] args) {
		testSqList();
		MyArray myarray = new MyArray(10);
		myarray.display();
		myarray.insert("dj");
		myarray.insert("xc");
		myarray.display();
		System.out.println(myarray.contains("dj"));
		System.out.println(myarray.delete("xc"));
		myarray.display();
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
