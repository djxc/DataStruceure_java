package com.dj.LinearTable.SqList;

public class SqList {
	/**
	 * length表示线性表元素的个数
	 * table表示线性表的容器
	 */
	private int length;
	private int size;
	private Object table[]; 
	
	/**
	 * 初始化顺序线性表，提供线性表的大小n
	 * @param n
	 */
	public SqList(int n){
		this.table = new Object[n];
		this.size = n;
		this.length = 0;
	}
	
	public SqList(Object[] os){
		this.table = os;
		this.length = os.length;
	}
	
	/**
	 * 插入元素，首先判断表是否满了；然后判断插入位置是否正确
	 * 线性表大小加一；index以后的元素向后以后一个位置
	 * @param index
	 * @param o
	 */
	public void insertSqList(int index, Object o){
		if(!isFull()){			
			if(index <= this.length){
				for(int i = this.length; i >= index ; i--){
					table[i] = table[i - 1];
				}
				this.table[index] = o;
				this.length++;
			} else{
				System.out.println("插入失败，插入的index位置不对");
			}
		}else{
			System.out.println("插入失败，线性表已经满了");
		}
	}
	
	/**
	 * 给定一个位置，删除该位置元素
	 * 首先判断index是否合理，大于0或者小于table的长度
	 * @param index
	 */
	public void deleteSqList(int index){
		if(!isEmpty()){			
			if(index >= 0 || index < table.length){			
				for (int i = index; i < this.length; i++){
					table[i] = table[i+1];
				}
				this.length--;
			}else{
				System.out.println("删除元素失败，index位置不对");
			}
		}
	}
	
	/**
	 * 设置元素，判断插入位置是否正确
	 * 判断当前位置是否为空，是则使线性表大小加一；
	 * @param index
	 * @param o
	 */
	public void setSqList(int index, Object o){			
		if(index < this.table.length){
			if(table[index] == null){					
				this.length++;				
			}
			this.table[index] = o;
		} else{
			System.out.println("插入失败，插入的index位置不对");
		}		
	}
	
	/**
	 * 查找元素
	 * 给定一个元素，遍历线性表，如果线性表当前元素与目标元素相等返回位置
	 * @param o
	 * @return
	 */
	public int findElement(Object o){
		for (int i = 0; i < table.length;i ++){
			if(table[i] == o){
				return i;
			}
		}
		return -1;
	}
	
	
	public void mergeList(SqList list1, SqList list2, SqList toList){
		int sumLength = list1.getLength() + list2.getLength();
		if(sumLength < toList.getSize()){
			int i = 0, j = 0, m = 0;
			while(i < list1.getLength()){				
				toList.table[m++] = list1.table[i++];
			}
			while(j < list2.getLength()){				
				toList.table[m++] = list2.table[j++];
			}
			
		}else{
			System.out.println("目标线性表太小，放不下！");
		}
	}
	
	/**
	 * 用来判断线性表是否满了
	 * @return
	 */
	public boolean isFull(){
		return this.length == table.length; 		
	}
	
	/**
	 * 判断线性表是否为空
	 * @return
	 */
	public boolean isEmpty(){
		return this.length == 0;
	}
	
	/**
	 * 输出线性表的元素，遍历线性表每个元素然后输出
	 */
	public void printSqList(){
		for (int i = 0; i < table.length;i ++){
			System.out.print(table[i] + " ");
		}
		System.out.println("\t");
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
