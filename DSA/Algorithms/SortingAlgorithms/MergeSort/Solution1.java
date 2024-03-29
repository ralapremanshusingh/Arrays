public class Solution1 {

    public static void mergeProcedure(int[] arr, int l, int mid, int r) {

        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] lsubArr =  new int[n1];
        int[] rsubArr =  new int[n2];

        for(int i = 0; i<n1; i++) {
            lsubArr[i] = arr[l+i];
        }
        for(int j = 0; j<n2; j++) {
            rsubArr[j] = arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j < n2) {
            if(lsubArr[i]<=rsubArr[j]) {
                arr[k]=lsubArr[i];
                i++;
            } else {
                arr[k]=rsubArr[j];
                j++;
            }
            k++;
        }

        while(i<n1) {
            arr[k]=lsubArr[i];
            i++;
        }

        while(l<n2) {
            arr[k]=rsubArr[j];
            j++;
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {

        while(l<r) {

            int mid = l+(r-l)/2;
            
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);

            mergeProcedure(arr,l,mid,r);
        }
    }

    public static void printArr(int[] arr) {

        for(int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int[] nums = {5,58,2,-5,9,5,7,6,21,7,-89};

        System.out.print("Before Merge Sort : ");
        printArr(nums);

        mergeSort(nums,0,nums.length-1);

        System.out.print("After Merge Sort : ");
        printArr(nums);
    }
}