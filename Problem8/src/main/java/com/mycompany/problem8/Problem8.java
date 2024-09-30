
package com.mycompany.problem8;
import java.util.Scanner;
public class Problem8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        scanner.close();
        int word = 0;
        int charcter = 0;
        int vowel = 0;
        int consonant = 0;

        input = input.toLowerCase();
        String[] words = input.split("\\s+"); 
        word = words.length;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                charcter++;

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                }
                else if (ch >= 'a' && ch <= 'z') {
                    consonant++;
                }
            }
        }


        System.out.println("Words: " + word);
        System.out.println("Chars: " + charcter);
        System.out.println("Vowel: " + vowel);
        System.out.println("Consonant: " + consonant);
    }
}


