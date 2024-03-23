// https://leetcode.com/problems/valid-anagram/description/

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;
       Map<Character, Integer> freqMap = new HashMap<>();

       for(char c : s.toCharArray()) {
            freqMap.put(c,(freqMap.getOrDefault(c,0)+1));
       }

       for(char c : t.toCharArray()) {
            int count = freqMap.getOrDefault(c,0);

            if(count==0) {
                return false;
            }
            freqMap.put(c,count-1);
       }
        return true;
        
    }
}