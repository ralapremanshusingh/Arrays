// 977. Squares of a Sorted Array => https://leetcode.com/problems/squares-of-a-sorted-array/description/

package DataStructures.Array.SquaresOfSortedArray;
import java.util.Arrays;

class Solution3 {
    static int[] arr = {-9,-8,-7,-6,-5,1,2,3,4,5,6,7};

    static int[] arr (int[] newArr) {
        
        for(int i = 0; i<newArr.length; i++) {
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
        return arr;
    }

    public static void main(String ars[]) {
        arr(arr);
    }
}
