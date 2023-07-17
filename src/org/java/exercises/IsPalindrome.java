package org.java.exercises;

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String word = scanner.nextLine();

        char[] wordCharArray = word.toCharArray();
        int length = wordCharArray.length;

        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            String p1 = String.valueOf(wordCharArray[i]);
            String p2 = String.valueOf(wordCharArray[length - 1 - i]);

            if (!p1.equalsIgnoreCase(p2)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " è un palindromo.");
        } else {
            System.out.println(word + " non è un palindromo.");
        }

    }
}
