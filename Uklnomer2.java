/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnomer2;
import java.util.Scanner;


public class Uklnomer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka awal   : ");
        int awal = input.nextInt();

        System.out.print("Masukkan angka akhir  : ");
        int akhir = input.nextInt();
      if (awal<akhir){
          System.out.println("angka akhir lebih besar");
      return;
      }
        for (int i = awal; i >= akhir; i--) {

            System.out.print(i + ". ");

            if (i == akhir) {      // 
                System.out.println("saya senang");
                break;
            }

            int pola = i % 3;

            switch (pola) {
                case 2:
                    System.out.println("saya anak wikusama");
                    break;
                case 1:
                    System.out.println("saya angkatan 34");
                    break;
                default:
                    System.out.println("saya anak moklet");
                    break;
            }
        }
    }
}
