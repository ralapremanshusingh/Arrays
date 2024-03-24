function insertionSort(nums) {

    for(let i =1; i<nums.length; i++) {

        let j=i

        while(j>0 && nums[j-1]>nums[j]) {

            let temp = nums[j]
            nums[j] = nums[j-1]
            nums[j-1] = temp
            j--
        }
    }
}

let arr = [1,222,31,0,57,-5]

insertionSort(arr)

let sort = ""

for(let a of arr) {
    sort += a +" "
}

console.log(sort)