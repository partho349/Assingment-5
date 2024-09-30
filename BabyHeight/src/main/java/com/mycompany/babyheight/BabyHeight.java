
package com.mycompany.babyheight;

import java.util.Scanner;
public class BabyHeight {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int[] heights = new int[10];

        System.out.println("Enter the heights of 10 babies in cm:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Baby " + (i + 1) + " height: ");
            heights[i] = scanner.nextInt();
        }
        scanner.close();


        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;


        for (int i = 0; i < 10; i++) {
            if (heights[i] < lowest) {
                secondLowest = lowest;
                lowest = heights[i];
            } else if (heights[i] < secondLowest && heights[i] != lowest) {
                secondLowest = heights[i];
            }
        }
        System.out.println("The lowest height is: " + lowest + " cm");
        System.out.println("The second lowest height is: " + secondLowest + " cm");
    }
    }

