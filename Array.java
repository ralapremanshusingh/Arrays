import java.util.Scanner;

public class Array {

    public static void inputArr(int[] arr) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements : ");
        for(int i=0; i<arr.length; i++)
            arr[i]=sc.nextInt();

        return ;

    }

    public static void printArr(int[] arr) {

        for(int i : arr)
            System.out.print(i + " ");
        
        System.out.println();

        return;
    }
}
