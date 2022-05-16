package com.algoritm.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] array = {5,2,3,4,1};
		int temp;
		int sortedArray;
		for(int i=0; i<array.length; i++) {
			temp = array[i];
			sortedArray=i;
			while(sortedArray>0 && array[sortedArray-1]>temp) {
				array[sortedArray] = array[sortedArray-1];
				sortedArray = sortedArray-1;
				
			}
			array[sortedArray] = temp;
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}

}
