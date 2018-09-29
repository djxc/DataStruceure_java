package com.bjsxt.sort.col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
	private final String name;//����
	private final int handsome;//˧��ָ��
	
	public Person() {
		name =null;
		handsome =0;
	}

	public Person(String name, int handsome) {
		super();
		this.name = name;
		this.handsome = handsome;
	}

	public String getName() {
		return name;
	}

	

	public int getHandsome() {
		return handsome;
	}

	
	
	@Override
	public String toString() {
		return "����:"+this.name+",˧��ָ��:"+this.handsome+"\n";
	}
	
	

}