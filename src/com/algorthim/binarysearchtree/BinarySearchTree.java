package com.algorthim.binarysearchtree;

public class BinarySearchTree {

	public static void main(String[] args) {
		
		int array[] = {2, 5, 7, 9, 12, 14, 16, 17, 19, 20, 24, 28};
		int searchElement = 16;
		int lowerIndex = 0;
		int higherIndex = array.length-1;
		int middleIndex = (lowerIndex + higherIndex)/2;
		
		while(lowerIndex <= higherIndex) {
			if(array[middleIndex] == searchElement) {
				System.out.println("Element is at "+middleIndex+" Index postion");
				break;
			}
			else if(array[middleIndex] < searchElement) {
				lowerIndex = middleIndex + 1;
			
			}
			else {
				higherIndex = middleIndex - 1;
			
			}
			middleIndex = (lowerIndex + higherIndex)/2;
		}
		if(lowerIndex > higherIndex) {
			System.out.println("element not found");
		}

	}
	
}
