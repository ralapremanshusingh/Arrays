function bubbleSort(nums) {

    for(let i =0 ; i<nums.length-1; i++) {
        let swap = false;

        for(let j=0; j<nums.length-i-1; j++) {

            if(nums[j]>nums[j+1] ) {

                let temp = nums[j]
                nums[j] = nums[j+1]
                nums[j+1] =temp
                swap = true
            }
        }

        if(!swap) {
            break
        }
    }
}


let arr = [ 3,42,895,2,3,22,0]

bubbleSort(arr)

let bubSort = " "

for(let a of arr) {
    bubSort+=a + " "
}

console.log(bubSort)
