package org.java.exercises.bonus;

import java.util.Scanner;

// Chiedi un numero di 4 cifre all’utente e calcola la somma di tutte le cifre che compongono il numero.
public class JSnack8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String number;
        char[] numberCharArray;
        int sum;


        System.out.print("Inserisci un numero: ");
        number = input.nextLine();

        sum = 0;
        numberCharArray = number.toCharArray();
        for (int i = 0; i < numberCharArray.length; i++) {
            sum += Integer.parseInt(String.valueOf(numberCharArray[i]));
        }

        System.out.println("La somma dei numeri è: " + sum);
    }
}
