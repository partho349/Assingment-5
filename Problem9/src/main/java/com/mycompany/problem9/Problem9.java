
package com.mycompany.problem9;
import java.util.Scanner;
import java.util.HashMap;
public class Problem9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        scanner.close();
        input = input.toLowerCase();

      
        HashMap<Character, Integer> charCountMap = new HashMap<>();

  
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

       
            if (ch != ' ') {

                if (charCountMap.containsKey(ch)) {
                    charCountMap.put(ch, charCountMap.get(ch) + 1);
                }
              
                else {
                    charCountMap.put(ch, 1);
                }
            }
        }


        System.out.println("Character frequencies:");
        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    }

