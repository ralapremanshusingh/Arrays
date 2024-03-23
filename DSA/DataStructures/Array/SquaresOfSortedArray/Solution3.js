// https://leetcode.com/problems/squares-of-a-sorted-array/description/

var sortedSquares = function(nums) {

    let n = nums.length-1
    let i=0
    let j=n
    let result = []

    while(i<=j) {
        if(nums[i]**2>=nums[j]**2) {
            result[n]=nums[i]**2
            i++
        } else {
            result[n]=nums[j]**2
            j--
        }
        n--
    }
    
    return result

};