public class Solution1 {

    public static void arrange(int[] arr,int p) {

        int n= arr.length;
        int[] newArr = new int[n];
        int i = 0;
        n--;
        int j = 0;
        int k = n;

        while(i<=n) {

            if(arr[i]<p) {
                newArr[j] = arr[i];
                j++;
            } else {
                newArr[k] = arr[i];
                k--;
            }
            i++;
        }

        for(int a : newArr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] nums = {4,2,8,3,9,1,0,6};

        arrange(nums,4)  ;
    }
}