public class SelectionSort { 

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

