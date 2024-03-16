package e_DSA.a_Algorithms.b_SortingAlgorithms;

import e_DSA.b_DataStructures.a_Array.a_ModifyArray.ModifyArray;

public class InsertionSort {

	public static void main(String[] args) {

		System.out.println();
		int[] element = ModifyArray.inputArray();

		System.out.println();
		System.out.println("Before Sort : ");
		ModifyArray.printArray(element);

		element = insertionSort(element);

		System.out.println("\n");
		ModifyArray.printArray(element);
		System.out.println();
	}

	private static int[] insertionSort(int[] element) {

		int n = element.length;

		for(int j = 1; j<n; j++ ) {
			
			int i =j;

			while (i > 0 && element[i - 1] > element[i]) {
				element[i] = element[i] + element[i - 1];
				element[i - 1] = element[i] - element[i - 1];
				element[i] = element[i] - element[i - 1];
				i--;	
			}
		}

		return element;
}}
