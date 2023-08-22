public class MissingArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9,10,11,12,13};
        int n=arr.length + 1;
        int sumOfNaturalNumbers = n*(n+1)/2;
        int sumOfArray=0;
        int missNumberInArray=0;
    
        for(int i: arr)
            sumOfArray+=i;
        
        missNumberInArray=sumOfNaturalNumbers-sumOfArray;

        System.out.println("Missing Number is : " + missNumberInArray);
    }
}
