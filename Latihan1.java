package Latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        // No 4: Input
        System.out.print("Masukkan Kehadiran: ");
        int kehadiran = input.nextInt();

        System.out.print("Masukkan Total Nilai: ");
        int N = input.nextInt();

        String grade;

        // No 5: Kondisi nilai
        if (N >= 80) {
            grade = "A";
        } else if (N >= 70) {
            grade = "B";
        } else if (N >= 60) {
            grade = "C";
        } else if (N >= 55) {
            grade = "D";
        } else {
            grade = "E";
        }

        // No 6: Validasi kehadiran
        double validasi = 21 * 75 / 100.0; // hasil = 15.75

        // No 7 & 8: Kondisi kehadiran
        if (kehadiran >= validasi) {
            System.out.println("Nilai: " + N);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Tidak Lulus (Kehadiran kurang)");
        }
    }
}