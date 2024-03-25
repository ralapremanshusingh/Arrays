// https://leetcode.com/problems/merge-sorted-array/description/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int l = m+n;
        l--;
        n--;
        m--;


        while(n>=0) {

            if(m>=0 && nums1[m]>nums2[n]) {
                nums1[l]=nums1[m];
                m--;
            } else {
                nums1[l]=nums2[n];
                n--;
            }
            l--;
        }
    }
}