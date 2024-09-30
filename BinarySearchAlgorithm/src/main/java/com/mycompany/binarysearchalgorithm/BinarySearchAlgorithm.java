
package com.mycompany.binarysearchalgorithm;
import java.util.Scanner;
public class BinarySearchAlgorithm {
 public static void main(String[] args) {
        double[] cgpas = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        selectionSort(cgpas);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the CGPA to search: ");
        double target = scanner.nextDouble();
        int result = binarySearch(cgpas, target);
        if (result == -1) {
            System.out.println("CGPA " + target + " is not present in the list.");
        } else {
            System.out.println("CGPA " + target + " is present at index " + result + " in the sorted array.");
        }

        scanner.close();
    }
    public static void selectionSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    public static int binarySearch(double[] array, double target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid; 
            }

            if (array[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

}
