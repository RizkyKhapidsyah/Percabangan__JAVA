package com.rizkykhapidsyah.javafundamental.percabangan;

import java.util.Scanner;

public class IfThenElseIfThenElse {
    public static void main(String[] args) {
        int nilaiUjian = 0;
        char indeksPrestasi;

        Scanner MasukkanNilai = new Scanner(System.in);

        System.out.print("Masukkan Nilai Ujian (1 - 100) : ");
        nilaiUjian = MasukkanNilai.nextInt();

        if (nilaiUjian >= 90) {
            indeksPrestasi = 'A';
        } else if (nilaiUjian >= 80) {
            indeksPrestasi = 'B';
        } else if (nilaiUjian >= 70) {
            indeksPrestasi = 'C';
        } else if (nilaiUjian >= 60) {
            indeksPrestasi = 'D';
        } else if (nilaiUjian >= 50) {
            indeksPrestasi = 'E';
        } else {
            indeksPrestasi = 'F';
        }

        System.out.println("Nilai Ujian Akhir Anda adalah " + indeksPrestasi);
    }
}
