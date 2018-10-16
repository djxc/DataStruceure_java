package com.dj.sort;


public class MySort {
	
	public MySort() {
	}
	
	/**
	 * 直接插入排序
	 * 将数组分为两部分，排序好的以及没有排序的；
	 * 选择没有排序好的第一个元素记为current，与排序好的最后一个开始循环进行比较。
	 * 如果current小于比较的元素，则将前一个位置设为当前元素值，即为：array[j+1] = array[j];
	 * @param array
	 * @return
	 */
	public void DirInsertsort(int[] array) {
		int a = 0;
		for (int i = 1; i< array.length; i++) {
			int current = array[i];
			int j = i - 1;
			
			while(j>=0 && current<array[j]) {
				array[j+1] = array[j];
				j--;
			}
			
			array[j+1] = current;
			
//			for(int j = i - 1; j>=0; j--) {
//				if(current<array[j]) {
//					array[j+1] = array[j];
//					if(j == 0) {
//						array[j] = current;
//					}
//				}else {
//					array[j+1] = current;
//					break;
//				}
//			}
		}
	}

	
	public void ShellSort(int[] array, int[] d) {
		for(int i:d) {
			ShellInsert(array, i);
		}
	}
	
	public void ShellInsert(int[] array, int d) {
		
	}
	
	/**
	 * 冒泡排序
	 * 相邻元素进行比较，后者小于前者进行交换。
	 * 循环一次，最大值被放在数组最后一个位置。然后对数组的前n-1个元素进行循环操作。
	 * 使用swap记录循环一次是否进行了交换，如果没有则跳出循环。
	 * @param array
	 */
	public void BubbleSort(int[] array) {
		for(int j = 0; j<array.length; j++) {			
			int current = array[0];
			int swap = 0;
			for (int i = 1; i<array.length-j; i++) {
				if(array[i]<array[i-1]) {
					current = array[i];
					array[i] = array[i-1];
					array[i-1] = current;
					swap = 1;
				}			
			}
			if(swap == 0) {
				break;
			}
		}
	}
	
	/**
	 *  快速排序
	 * 
	 * @param array
	 * @param start
	 * @param end
	 */
	public void FastSort(int[] array, int start, int end) {
		int current = array[start];
		int i=start, j = end;
		while(i<j) {
			while(j>i && array[j]>=current) {
				j--;
			}
			if(i<j) {
				array[i++] = array[j];
			}
			while(j>i && array[i]<=current) {
				i++;
			}
			if(i<j) {
				array[j--] = array[i];
			}			
		}
		array[i] = current;
		if(start<end) {
			FastSort(array, start, i-1);
			FastSort(array, i+1, end);
		}
	}
	
	/**
	 * 选择排序
	 * 选择第一个数为最小的数，然后遍历数组，比较当前数与最小数的大小。如果小于最小的数，则最小数设为当前数。
	 * 遍历完一遍找出最小的数，如果最小的数与第一个数不是一个则进行交换。
	 * 然后从第二个数开始进行以上操作。
	 * @param array
	 */
	public void SelectSort(int[] array) {
		int swap = 0;
		for(int i = 0; i<array.length;i++) {
			int current = i;
			for(int j = i+1; j<array.length; j++) {				
				if(array[current]>array[j]) {
					current = j;
				}
			}
			if(current!=i) {				
				swap = array[i];
				array[i] = array[current];
				array[current] = swap;
			}
		}
	}
	
}
