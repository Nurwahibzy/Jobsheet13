package Jobsheet13;

import java.util.Scanner;

public class UcapanTerimaKasih_21 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan:");
        String namaOrang = sc.nextLine();
        return namaOrang;
        
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        String ucapanTmbh = UcapanTambahan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
                "You inspired in me a love for learning anda made me feel like I could ask you anything.");
                System.out.println("Pesan Tambahan: " + ucapanTmbh);
    }

    public static String UcapanTambahan() {
         Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Ucapan tambahan:");
        String ucapan = sc.nextLine();
        sc.close();
        return ucapan;
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
      
    }
}
