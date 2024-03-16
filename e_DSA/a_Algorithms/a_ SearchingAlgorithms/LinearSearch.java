package Algorithms.SearchingAlgorithms;

import java.util.Scanner;
import Array.ModifyArray.ModifyArray;

public class LinearSearch {

    private static int linearSearch(int[] arr) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Your Key : ");
            int key = sc.nextInt();
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                if (arr[i] == key)
                    return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        int[] element = ModifyArray.inputArray();

        int result = linearSearch(element);

        if (result == -1) {
            System.out.println("Your key is not present.");
        } else {
            System.out.println("Your key at index : " + result);
        }

    }

}
