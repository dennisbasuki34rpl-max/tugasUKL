package com.mycompany.uklnomer4;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Uklnomer4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int angkaBenar = rand.nextInt(100) + 1; 
        ArrayList<Integer> riwayatTebakan = new ArrayList<>();

        System.out.println("=== Permainan Tebak Angka (1 - 100) ===");
        System.out.print("Batas percobaan: ");
        int bp = input.nextInt();

        int tebakan = 0;
        int percobaan = 0;
        int salah = 0;  

        while (tebakan != angkaBenar && percobaan < bp) {
            System.out.print("Masukkan tebakan (1-100): ");
            tebakan = input.nextInt();

            if (tebakan < 1 || tebakan > 100) {
                System.out.println("Inputan tidak boleh lebih besar dari 100 atau kurang dari 1!");
                continue;
            }

            riwayatTebakan.add(tebakan);
            percobaan++;

            if (tebakan > angkaBenar) {
                System.out.println("Tebakan terlalu tinggi!");
                salah++; 
            } else if (tebakan < angkaBenar) {
                System.out.println("Tebakan terlalu rendah!");
                salah++;  
            } else {
                System.out.println("Anda menebak dengan benar!");
                break;
            }

            System.out.println("Sisa percobaan: " + (bp - percobaan));
        }

        System.out.println("\n=== Riwayat Tebakan Anda ===");
        for (int i = 0; i < riwayatTebakan.size(); i++) {
            System.out.println("Tebakan ke-" + (i + 1) + ": " + riwayatTebakan.get(i));
        }
        System.out.println("Anda menebak salah sebanyak: " + salah +"kali");
    }
}
