// https://leetcode.com/problems/contains-duplicate/description/

var containsDuplicate = function(nums) {
    
    let numSet = new Set()
 
     for(let i of nums) {
         if(numSet.has(i)) {
             return true
         } else {
             numSet.add(i)
         }
     }
     return false;
 
 };