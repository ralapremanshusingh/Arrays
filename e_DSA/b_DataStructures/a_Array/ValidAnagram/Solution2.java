// 242. Valid Anagram => https://leetcode.com/problems/valid-anagram/description/

package e_DSA.b_DataStructures.a_Array.ValidAnagram;

import java.util.Arrays;

public class Solution2 {

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        } else {
            char[] ss = s.toCharArray();
            char[] tt = t.toCharArray();
            Arrays.sort(ss);
            Arrays.sort(tt);
            
            for(int i = 0; i < ss.length; i++) {
                if(ss[i]!=tt[i])
                    return false;
            }

            return true;   
        }
    }

    public static void main(String args[]) {
        String s = "anagram", t = "nagaram";
        String r = "rat", c = "car";

        System.out.println(isAnagram(s,t));
        System.out.println(isAnagram(r, c));
        
    }

}
