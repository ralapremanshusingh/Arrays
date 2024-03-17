// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

package E_DSA.B_DataStructures.D_TwoSumTwo;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;

        while(i<j) {
            if(numbers[i]+numbers[j]==target) {
                return new int[] {i+1, j+1};
            } else if(numbers[i]+numbers[j]>target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] {};
    }
}