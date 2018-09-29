package com.bjsxt.sort.innerType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Demo04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date[] arr =new Date[3];
		arr[0] =new Date();
		arr[1] =new Date(System.currentTimeMillis()-1000*60*60);
		arr[2] =new Date(System.currentTimeMillis()+1000*60*60);
		Utils.sort(arr); //½µĞò
		System.out.println(Arrays.toString(arr));
		
		
		//×Ö·û´®
		String[] arr2 ={"a","abcd","abc","def"};
		Utils.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		
		System.out.println("==========ListÅÅĞò===========");
		//´æ·ÅÈİÆ÷ÖĞ
		List<String> list =new ArrayList<String>();
		list.add("a");
		list.add("abcd");
		list.add("abc");
		list.add("def");
		Utils.sort(list);
		System.out.println(list);
		
		
		
		
		System.out.println("==========Ê¹ÓÃComparator ÅÅĞòÊı×é===============");
		arr2 =new String[]{"a","abcd","abc","def"};
		Utils.sort(arr2,new StringComp());
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("==========ListÅÅĞò+±È½ÏÆ÷===========");
		list =new ArrayList<String>();
		list.add("a");
		list.add("abcd");
		list.add("abc");
		list.add("def");
		Utils.sort(list,new StringComp());
		System.out.println(list);
		
	}

}
