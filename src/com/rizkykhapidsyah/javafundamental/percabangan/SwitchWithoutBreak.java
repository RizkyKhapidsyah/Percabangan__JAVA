package com.rizkykhapidsyah.javafundamental.percabangan;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        char Input = 'C';
        int Output = 0;

        switch (Input) {
            case 'A':
                Output++;
            case 'B':
                Output++;
            case 'C':
                Output++;
            case 'D':
                Output++;
            case 'E':
                Output++;
            default:
                Output++;
        }

        System.out.println("Nilai akhirnya adalah " + Output);
    }
}
