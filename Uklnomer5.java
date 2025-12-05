package com.mycompany.uklnomer5;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

public class Uklnomer5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       
        int n = input.nextInt();

        int[] array = new int[n];

        
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

 
        HashMap<Integer, Integer> frekuensi = new HashMap<>();
        for (int angka : array) {
            if (frekuensi.containsKey(angka)) {
                frekuensi.put(angka, frekuensi.get(angka) + 1);
            } else {
                frekuensi.put(angka, 1);
            }
        }
        Arrays.sort(array);

        System.out.println("\nOutput:");
        for (int angka : Arrays.stream(array).distinct().toArray()) {
            System.out.println(angka + " muncul " + frekuensi.get(angka) + " kali");
        }
        int angkaTerbanyak = 0;
        int frekuensiTertinggi = 0;

        for (int key : frekuensi.keySet()) {
            if (frekuensi.get(key) > frekuensiTertinggi) {
                frekuensiTertinggi = frekuensi.get(key);
                angkaTerbanyak = key;
            }
        }

    }
}
