package Algorithms.SortingAlgorithms;

import Array.ModifyArray.ModifyArray;

public class SelectionSort { 

	public static void main(String[] args) {

		System.out.println();
		int[] element = ModifyArray.inputArray();
		
		System.out.println();
		System.out.println("Before Sorted");
		ModifyArray.printArray(element);

		element = selectionSort(element);

		System.out.println("\n");
		System.out.println("After Sorted : ");
		ModifyArray.printArray(element);
		System.out.println("\n");
	}

	private static int[] selectionSort(int[] element) {

		int n = element.length;

		for(int i = 0; i<n; i++) {

			int minIndex = i;

			for(int j= i+1; j<n; j++) {
				
				if(element[minIndex] > element[j]) {
					minIndex=j;
				}
			}

			if(minIndex!=i) {
				element[minIndex] = element[minIndex] + element[i];
				element[i] = element[minIndex] - element[i];
				element[minIndex] = element[minIndex] - element[i];
			}
		}
		
		return element;
	}
	
}

