package com.company;

import java.util.Scanner;

public class Main {

    private static int primeNumbers(long limit) {
        int counterPrimeNumbers = 0;
        int counterInner = 0;
        for (int i = 2; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i % j) == 0) {
                    counterInner++;
                }
            }
            if (counterInner == 2) {
                counterPrimeNumbers++;
                System.out.println("Prime number " + counterPrimeNumbers + " is: " + i);
            }
            counterInner = 0;
        }

        return counterPrimeNumbers;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the limit to which You want to calculate the number of prime numbers");
        // int limit = scan.nextInt();
        long limit = scan.nextLong();
        scan.close();
        System.out.println("Number of prime numbers to the limit of " + limit + " is: " + primeNumbers(limit));

    }
}
