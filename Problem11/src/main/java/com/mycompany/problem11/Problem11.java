
package com.mycompany.problem11;
import java.util.Scanner;
public class Problem11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        scanner.close();

        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!vowels.contains(String.valueOf(ch))) {
                result.append(ch);
            }
        }


        System.out.println("String after removing vowels: " + result.toString());
    }
    }

