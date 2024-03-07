package Array.ModifyArray;

import java.util.Scanner;

public class ModifyArray {

    public static int[] inputArray() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Element Length : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;

    }
}
