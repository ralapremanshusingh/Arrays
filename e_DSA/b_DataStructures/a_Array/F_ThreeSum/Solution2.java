// 15. 3Sum => https://leetcode.com/problems/3sum/description/

package E_DSA.B_DataStructures.A_Array.F_ThreeSum;

public class Solution2 {
    

    static void threeSum(int[] nums) {
        int n= nums.length;

        for(int a=0; a<n; a++) {
            for(int b=a+1; b<n; b++) {
                for(int c=b+1; c<n; c++) {
                    if(nums[a]+nums[b]+nums[c]==0) {
                        System.out.println(nums[a] + " " + nums[b] + " " + nums[c]);
                    }
                }
            }
        }        
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};

        threeSum(arr);
    }
}
