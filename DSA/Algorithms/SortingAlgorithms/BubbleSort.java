
public class BubbleSort {
    
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




