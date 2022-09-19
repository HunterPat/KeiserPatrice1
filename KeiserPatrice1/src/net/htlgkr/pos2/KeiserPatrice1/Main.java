package net.htlgkr.pos2.KeiserPatrice1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a limit of numbers");
        int quantity = scanner.nextInt();
        EratosthenesPrimeSieve eratosthenesPrimeSieve = new EratosthenesPrimeSieve(quantity);
        System.out.println("Prime numbers:\n");
        eratosthenesPrimeSieve.printPrimes();
    }
}
