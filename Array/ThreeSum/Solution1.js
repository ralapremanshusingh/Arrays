const threeSum=function(nums) {
    nums.sort((x,y)=>x-y)
    let n = arr.length;
    let newArr = []
    let a=0;
    let b=a+1;
    let c=b+1;
    let d =0;
    while(a<n-2) {
        while(c<arr.length) {

            if(arr[a] + arr[b] + arr[c] == 0){
                newArr[d]=[nums[a], nums[b], nums[c]]
                d++
            }
            c++
        }
        c=b+1;
        a++; b++; c++;
    }

    for(let i=0; i<newArr.length; i++) {
        for(let j=i+1; j<newArr.length; j++) {
            if(newArr[i]===newArr[j]) {
                delete newArr[j]
            }
        }
    }
    return newArr
}

let arr = [0,0,0,0]

console.log(threeSum(arr))