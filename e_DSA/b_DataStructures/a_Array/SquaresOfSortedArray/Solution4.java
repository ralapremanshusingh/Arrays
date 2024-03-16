// 977. Squares of a Sorted Array => https://leetcode.com/problems/squares-of-a-sorted-array/description/

package e_DSA.b_DataStructures.a_Array.SquaresOfSortedArray;

public class Solution4 {

   static int[] squareSort(int[] newArr) {

        int n = newArr.length;
        int[] anotherNewArr = new int[n];
        n--;
        int i=0;
        int j=n;       

        while(n>-1) {
            int left=newArr[i]*newArr[i];
            int right=newArr[j]*newArr[j];

            if(left>right) {
                anotherNewArr[n]=left;
                i++;
            } else {
                anotherNewArr[n]=right;
                j--;
            }
            n--;
        }
        
        return anotherNewArr;
   }

   public static void main(String[] args) {
    
        int[] nums = {-9,-8,-7,-6,-5,1,2,3,4,5};

        int[] newNums = squareSort(nums);

        for (int i : newNums) {
            System.out.print(i + " ");
        }
   }

    
}
