// https://leetcode.com/problems/3sum/description/
 var threeSum = function(nums) {

    nums.sort((x,y)=> x-y)
      
    let triplets = []
    for(let i=0; i<nums.length-2; i++) {

            if(i==0 || (i>0 && nums[i]!=nums[i-1])) {

                let j=i+1
                let k=nums.length-1
                let target=-nums[i]

                while(j<k) {

                    let sum = nums[j] + nums[k]

                    if(target == sum) {

                        triplets.push([nums[i], nums[j], nums[k]])

                        while(j<k && nums[j]==nums[j+1] ) j++
                        while(j<k && nums[k]==nums[k-1] ) k--
                         j++ 
                         k--
                    }

                    else if(sum>target){
                        while(j<k && nums[k]==nums[k-1] ) k--
                        k--
                    } 
                    else {
                        while(j<k && nums[j]==nums[j+1] ) j++
                        j++ 
                    }
                }  
                
            }
        }
        return triplets
    }