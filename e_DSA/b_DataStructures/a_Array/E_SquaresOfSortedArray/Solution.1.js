// https://leetcode.com/problems/squares-of-a-sorted-array/description/

var sortedSquares = function(nums) {

    let n = nums.length

    for(let i=0; i<n; i++) {
        nums[i]*=nums[i]
    }

    nums.sort((x,y)=>x-y)

    return nums

};