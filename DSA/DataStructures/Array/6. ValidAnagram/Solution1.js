// https://leetcode.com/problems/valid-anagram/description/

var isAnagram = function(s, t) {

    if(s.length!==t.length) return false

    let mp = {}
    
    for(let i=0; i<s.length; i++) {
        if(mp[s[i]]) {
            mp[s[i]]+=1
        } else {
            mp[s[i]]=1
        }
    }

    for(let i=0; i<t.length; i++) {
        if((mp[t[i]] == undefined) || (mp[t[i]] == 0) ) {
            return false
        } else {
            mp[t[i]]-=1
        }
    }

    return true
    
};