package net.htlgkr.pos2.KeiserPatrice1;

public class EratosthenesPrimeSieve implements PrimeSieve {
    int quantity;
    int[] primes = new int[quantity];
    int counter = 0;


    public EratosthenesPrimeSieve(int quantitiy) {
        this.quantity = quantitiy;
    }

    @Override
    public boolean isPrime(int p) {
        if (p == 2 || p == 3 || p % 2 != 0 && p % 3 != 0) {
            return true;
        }
            return false;
    }

    @Override
    public void printPrimes() {
        for (int i = 1; i < quantity; i++) {
            System.out.println(i+" "+ isPrime(i) + "\n" + "--------------");
        }
    }
}
