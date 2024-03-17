// https://leetcode.com/problems/squares-of-a-sorted-array/description/

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int result[] = new int[n];
        int i=0;
        int j=n-1;
        n--;
        while(i<=j) {
            int n1=nums[i]*nums[i];
            int n2=nums[j]*nums[j];
            if(n1>n2) {
                result[n]=n1;
                i++;
            } else {
                result[n]=n2;
                j--;
            }
            n--;
        }
        return result;
    }
}