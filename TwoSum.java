import java.util.Scanner;

public class TwoSum {

    public static int [] twoSum(int[] arr, int target) {

        for(int i=0; i<arr.length-1; i++)
            for(int j=i+1; j<arr.length; j++)
                if(arr[i]+arr[j]==target)
                    return new int[] {i, j};

        return new int[] {};
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements : ");
        int l = sc.nextInt();

        int[] arr = new int[l];
        Array.inputArr(arr);

        System.out.print("Which elements you want to find : ");
        int target = sc.nextInt();

        arr=TwoSum.twoSum(arr, target);

        Array.printArr(arr);

        sc.close();


    }
}