// https://leetcode.com/problems/reverse-string/description/

package E_DSA.B_DataStructures.A_Array.C_ReverseString;

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