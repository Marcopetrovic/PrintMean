package com.company;

public class PrintMean {

    public static void main(String[] args) {
        System.out.println("Mean of 1, 1, 3, 3: " + meanCalc(1, 1,3,3));
        System.out.println("Mean of 1, 2, 3, 4: " + meanCalc(1, 2,3,4));
        System.out.println("Mean of 1, -2, 3, -4: " + meanCalc(1, -2,3,-4));
        System.out.println("Mean of -1, -11, 24, 2: " + meanCalc(-1, -11,24,2));
// For educational purpose onlyS


    }

    public static String meanCalc(double a, double b, double c, double d) {
        String mean = String.valueOf((a + b + c + d) / 4);

        return mean;

    }
}