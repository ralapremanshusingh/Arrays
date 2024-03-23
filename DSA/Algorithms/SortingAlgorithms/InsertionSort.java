public class InsertionSort {

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
