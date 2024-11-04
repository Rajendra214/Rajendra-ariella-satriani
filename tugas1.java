/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author NITRO V 15
 */
import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================Program Tunjangan================");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        double gajiPokok = scanner.nextDouble();
        scanner.nextLine(); // menangkap enter
        System.out.print("Status Anda? (Menikah/Belum) : ");
        String status = scanner.nextLine();

        double tunjangan = (status.equalsIgnoreCase("Menikah")) ? 0.35 * gajiPokok : 0;
        double totalGaji = gajiPokok + tunjangan;

        System.out.println("\n================Hasil Perhitungan Gaji Anda================");
        System.out.println("Gaji Pokok           : Rp " + gajiPokok);
        System.out.println("Tunjangan            : Rp " + tunjangan);
        System.out.println("Total Gaji           : Rp " + totalGaji);
        System.out.println("(Developed by : Rizki Adam Kurniawan)");
    }
}



