// 977. Squares of a Sorted Array => https://leetcode.com/problems/squares-of-a-sorted-array/description/

const sorted = function (arr) {
    for (let i = 0; i < arr.length; i++) {
        arr[i] = arr[i] ** 2
    }

    arr.sort((x, y) => x - y)
    return arr
}

let sortArray = [-5, -4, -3, -2, 3, 4, 5, 6]

sorted(sortArray)
console.log(sortArray);