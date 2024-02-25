let twoSum = function(nums,target) {

    let i=0, j=nums.length-1;

    while(i<j) {
        if(nums[i]+nums[j]==target) {
            return [i+1,j+1]
        } else if(nums[i]+nums[j]>target) {
            j--
        } else {
            i++
        }
    }
    return;
}

let numbers = [1,2,32,45,65]
targ = 77

console.log(twoSum(numbers,targ));

