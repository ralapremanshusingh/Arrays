public class InsertionSort {

	public static void insertionSort(int[] nums) {

		for(int i = 1; i<nums.length; i++) {
			

			for(int j=i; j>0;j--) {

				if(nums[j]<nums[j-1]) {
					int temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = temp;
				} else {
					break;
				}
			}
		}
	}


	public static void main(String args[]) {

		int[] arr = {2,32,4,2,-1};

		insertionSort(arr);

		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}