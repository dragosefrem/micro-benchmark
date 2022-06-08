package edu.poli.efrem.microbenchmark;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

    public void execute() {
        for (int i = 0; i < 1000; i++) {
            for (Integer integer : primeFactors(i)) {
                System.out.println(integer);
            }
        }
    }
}