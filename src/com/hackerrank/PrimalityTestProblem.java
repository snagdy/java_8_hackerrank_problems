package com.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTestProblem {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String n = scanner.nextLine();
//        scanner.close();

        String n = "13";

        BigInteger someNum = new BigInteger(n);
        if (someNum.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
