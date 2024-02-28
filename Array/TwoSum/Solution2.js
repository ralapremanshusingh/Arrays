// 1. Two Sum => https://leetcode.com/problems/two-sum/description/

let arr =[3,2,4,5,7];
let targ= 9;

function twoSum(nums,target) {
    let n = arr.length;
    for(let i=0; i<n-1; i++) {
        for(let j=i+1; j<n; j++){
            if(arr[i]+arr[j]==target) {
                return [i,j]
            }
        }
    }
    return null;
}

console.log(twoSum(arr,targ));