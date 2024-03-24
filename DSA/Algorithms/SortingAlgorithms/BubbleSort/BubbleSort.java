public class BubbleSort {

	public static void bubbleSort(int[] nums) {

		for(int i = 0; i<nums.length; i++) {

			boolean swap = false;

			for(int j = 0; j<nums.length-i-1; j++) {

				
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					swap = true;
				}

			}
			if(!swap) {
					break;
				}
		}
	}

	public static void main (String args[]) {
		int []arr = { 3,4,2,5,6,5,44};

		bubbleSort(arr);

		for(int a : arr) {
			System.out.print(a  + " ");
		}

		System.out.println();
	}
}