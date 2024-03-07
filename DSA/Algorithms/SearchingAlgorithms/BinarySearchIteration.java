package Algorithms.SearchingAlgorithms;

import java.util.Scanner;

import Array.ModifyArray.ModifyArray;

public class BinarySearchIteration {

    public static void main(String[] args) {
        int[] element = ModifyArray.inputArray();

        int result = binarySearchIteration(element);

        if (result == -1) {
            System.out.println("Your key is not Present.");
        } else {
            System.out.println("Your key is present at index : " + result);
        }
    }

    private static int binarySearchIteration(int[] element) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Key : ");
        int key = sc.nextInt();

        int n = element.length;
        int leftIndex = 0;
        int rightIndex = n - 1;
        int mid = 0;

        while (leftIndex <= rightIndex) {
            mid = (leftIndex + rightIndex) / 2;

            if (key == element[mid]) {
                return mid;
            } else if (key < element[mid]) {
                rightIndex = mid - 1;
            } else {
                leftIndex = mid + 1;
            }

        }
        return -1;
    }
}
