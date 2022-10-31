package org.example;

public class Main {
    public static void main(String[] args) {
        //java -jar naziv-projekta sinus 90

        if(args[0].equals("sinus")) {
            System.out.println(Kalkulacije.Sinus(Double.parseDouble(args[1])));
        }
    }
}