package org.java.exercises.bonus;

public class JSnack9 {
    public static void main(String[] args) {

        int sum;
        double average;

        sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        average = (double) sum / 10;

        System.out.println("La somma dei primi 10 numeri è: " + sum);
        System.out.println("e la media è: " + average);
    }
}