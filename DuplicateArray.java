public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,6,7,7,8,9,9};

        for(int i=0;i<arr.length;i++)
            for(int j=i+1; j<arr.length; j++)
                if(arr[i]==arr[j])
                    System.out.println("Dulplicate element in Array is : " + arr[i]);
            
    }
}
