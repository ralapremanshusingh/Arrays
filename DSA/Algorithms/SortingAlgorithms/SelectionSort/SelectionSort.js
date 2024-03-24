function selectionSort(nums) {

    for(let i=0; i<nums.length-1; i++) {

        for(let j=i+1; j<nums.length; j++) {
            
            if(nums[i]>nums[j]) {
                let temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
            }
        }
    }
}

let arr =[3,2,4,22,5,0,-88, 3,322]

selectionSort(arr)

let print = " "

for(let a of arr) {

        print += a + " "
}

console.log(print)