package e_DSA.b_DataStructures.a_Array.a_ModifyArray;

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
        System.out.println("\n");
        return arr;

    }

    public static void printArray(int[] arr) {

        System.out.print("Your Element is : ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
