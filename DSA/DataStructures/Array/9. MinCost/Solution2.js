function minCost(nums) {

    let totalSum = 0

    for(let a of nums) {
        totalSum+=a
    }

    nums.sort((a, b) => b - a)

    let minCost=0
    let n = nums.length

    for(let b of nums) {
        minCost += totalSum
        totalSum -= b
    }

    console.log(`Min Cost is ${minCost}`)
}

let arr = [1,2,3]

minCost(arr)