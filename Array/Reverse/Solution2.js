let s = ['s','o','n','u']

let reverse = function(s) {
    for(i=0,j=s.length-1; i<j; i++,j--) {
       let  temp = s[i]
        s[i]=s[j]
        s[j]=temp
    }
    return s;
}
reverse(s)
console.log(s);