// 1. Two Sum => https://leetcode.com/problems/two-sum/description/

package DataStructures.Array.TwoSum;

class Solution {
    static int arr[] = {1,4,5,6};
    static int target =7;

    static int[] twoSum(int[] nums,int target) {

        int n = nums.length;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i]+nums[j]==target) {
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {};
    } 

    public static void main (String args[]) {
        int arrs[] = {};
        arrs = twoSum(arr, target);
        for (int i : arrs) {
            System.out.print(i+" ");
        }
    }
}