import java.util.Arrays;
public class Solution1 {

    public static void minCost(int[] arr) {

        int totalSum=0;

        for(int a : arr) 
            totalSum+=a;

        Arrays.sort(arr);

        int minCost = 0;
        int n = arr.length;

        for(int i=n-1; i>-1; i--) {
            minCost+=totalSum;
            totalSum -= arr[i];            
        }

        System.out.println("Min Cost is : " + minCost);
    }

    public static void main(String args[]) {
        int[] nums = {3,2,1};

        minCost(nums);
    }
}