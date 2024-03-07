package Algorithms.SortingAlgorithms;

import Array.ModifyArray.ModifyArray;
public class BubbleSort {
    
	public static void main(String[] args) {


		System.out.println();
		int[] element = ModifyArray.inputArray();

		System.out.println();
		System.out.println("Before Sorted : ");
		ModifyArray.printArray(element);

		element = bubbleSort(element);

		System.out.println("\n");
		System.out.println("After Sorted : ");
		ModifyArray.printArray(element);


	}

	private static int[] bubbleSort(int[] element) {
	
		int n = element.length;

		for(int j =0; j<n-1; j++) {

			for(int i = 0; i<n-j-1; i++) {

				if(element[i] > element[i+1]) {
					element[i] = element[i] + element[i+1];
					element[i+1] = element[i] - element[i+1];
					element[i] = element[i] - element[i+1];
				}
			}
		}

		return element;
	}
	
}




