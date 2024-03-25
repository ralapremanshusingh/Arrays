// https://leetcode.com/problems/merge-sorted-array/description/

var merge = function(nums1, m, nums2, n) {
    
    let l = m+n-1
    m--
    n--

    while(n>=0) {

        if(m>=0 && nums1[m]>nums2[n]) {
            nums1[l] = nums1[m]
            m--
        } else {
            nums1[l] = nums2[n]
            n--
        }
        l--
    }
};