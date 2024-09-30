package com.mycompany.notecounter;
import java.util.Scanner;
public class NoteCounter {

    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        scanner.close();

        int[] noteCounter = new int[notes.length];
        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }
        System.out.println("Note count for the given amount:");
        for (int i = 0; i < notes.length; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : " + noteCounter[i]);
            }
        }
    }
}

    

