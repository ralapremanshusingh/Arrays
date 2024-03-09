// 167. Two Sum II - Input Array Is Sorted => https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

package DataStructures.Array.TwoSumOfSortedArray;

public class Solution1 {

static int[] twoSum (int[] nums,int target) {
    
    int i=0, j=nums.length-1;
    while(i<j) {
        if(nums[i]+nums[j]==target) {
            return new int[] {i+1, j+1};
        } else if(nums[i]+nums[j]>target) {
            j--;
        } else {
            i++;
        }
    }
    return new int[] { };
}

public static void main(String[] args) {
    int[] numbers = {1,2,3,14,34,67,80};

    int tar = 94;

    for (int i : twoSum(numbers, tar)) {
        System.out.print(i + " ");
    }
}
    
}
