package org.example;

public class Kalkulacije {

    Kalkulacije(double broj) {
    }

    public Kalkulacije() {
    }

    public static double Faktorijel(double broj) {
        int x = 1, fact = 1;
        while (x <= broj) {
            fact = fact * x;
            x++;
        }
        return fact;
    }

    public static double Sinus(double broj) {
        return Math.sin(broj);
    }

    public static void ispisiVrijednosti(double broj) {
        System.out.printf("Sinus unesenog broja je : %f ", Sinus(broj));
        System.out.printf("Faktorijel unesenog broja je : %f", Faktorijel(broj));
    }

}
