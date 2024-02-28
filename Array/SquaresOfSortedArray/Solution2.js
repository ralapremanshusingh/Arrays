// 977. Squares of a Sorted Array => https://leetcode.com/problems/squares-of-a-sorted-array/description/

const sort = function (arr) {
    let newArr = []
    let j = arr.length - 1
    let i = 0

    for (let n = j; n > -1; n--) {

        if (arr[i] ** 2 > arr[j] ** 2) {
            newArr[n] = arr[i] ** 2;
            i++;
        }
        else {
            newArr[n] = arr[j] ** 2
            j--
        }

    }

    return newArr
}

let nums = [-9, -7, -5, 0, 2, 3, 5, 7]


console.log(sort(nums));
