package com.dj.LinearTable;

public class MyArray {
	private int length = 0;
	private String [] strArray;
	
	public MyArray(int max){
		strArray = new String[max];
	}
	
	/**
	 * 在字符数组中查看是否包含某个字符
	 * @param str
	 * @return
	 */
	public int contains(String str){
		for(int i = 0; i < length; i++){
			if(strArray[i].equals(str)){
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 插入字符
	 * @param str
	 */
	public void insert(String str){
		strArray[length] = str;
		length ++;
	}
	
	
	public boolean delete(String str){
		for(int i = 0; i < length; i++){
			if(strArray[i].equals(str)){
				replace(i);
				length--;
				return true;
			}
		}
		return false;
	}
	
	public void replace(int i){
		for (int j = i; j < length; j++){
			strArray[j] = strArray[j + 1];
		}
	}
	
	/**
	 * 显示字符
	 */
	public void display(){
		if(length == 0){
			System.out.println("空");
		}else{			
			for(int i = 0; i < length - 1; i++){
				System.out.print(strArray[i] + ", ");
			}		
			System.out.print(strArray[length - 1] + "\n");
		}
	}
	
}
