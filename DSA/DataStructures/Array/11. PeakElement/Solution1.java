class Solution {
    public int findPeakElement(int[] nums) {
        
        int lIndex = 0;
        int rIndex = nums.length-1;

        int mid = 0;

        

        while(lIndex < rIndex) {

            mid =  (rIndex - lIndex) / 2 + lIndex;

            if(nums[mid]>nums[mid+1]) {
                rIndex = mid;
            } else {
                lIndex = mid+1;
            }

        }

        return lIndex;

    }
}