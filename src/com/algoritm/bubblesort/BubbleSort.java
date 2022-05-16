package com.algoritm.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		
		System.out.println("Bubble Sort");
		
		int[] array = {3,8,9,2,6,1};
		BubbleSort sort = new BubbleSort();
		sort.bubblesort(array);
	}

	public int bubblesort(int[] array) {
		int temp = 0;
		for(int i=0; i<array.length; i++) {
			int flag = 0;
			for(int j=0; j<array.length-1-i; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag = 1;	
				}
			}
			if(flag == 0) {
				break;
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		return temp;
		
	}
}
