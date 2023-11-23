package Jobsheet13;

import java.util.Scanner;

public class Kubus21 {
    

    // Fungsi untuk menghitung luas permukaan kubus
    public static int hitungLuas(int sisi) {
        return 6 * sisi * sisi;
    }

    // Fungsi untuk menghitung luasPermukaan kubus
    public static int hitungluasPermukaan(int sisi) {
        return sisi * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Sisi Kubus: ");
        int sisi = input.nextInt();

        // Menghitung dan menampilkan luas permukaan kubus
        int luasKubus = hitungLuas(sisi);
        System.out.println("Luas Kubus adalah: " + luasKubus);

        // Menghitung dan menampilkan luasPermukaan kubus
        int luasPermukaanKubus = hitungluasPermukaan(sisi);
        System.out.println("luasPermukaan Kubus adalah: " + luasPermukaanKubus);
        input.close();
    }
}

