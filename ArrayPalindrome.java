public class ArrayPalindrome {
    int []arr={1,2,2,3,2,2,1};
    int n=arr.length;

    boolean palindrome() {
    
        for(int i=0; i<n/2; i++)
            if(arr[i]!=arr[n-1-i]) {
              System.out.println("Not a Palindrome array");
              return false;
            }
        return true;
    }
}

class Main {
    public static void main(String[] args) {
        ArrayPalindrome arrayPalindrome = new ArrayPalindrome();
        if(arrayPalindrome.palindrome())
            System.out.println("A Palindrome array");
    }
}