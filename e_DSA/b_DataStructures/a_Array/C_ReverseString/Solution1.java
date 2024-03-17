// https://leetcode.com/problems/reverse-string/description/

package e_DSA.b_DataStructures.a_Array.c_ReverseString;

class Solution {
    public void reverseString(char[] s) {

        int i=0;
        int j=s.length-1;

        while(i<j) {
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        
    }
}