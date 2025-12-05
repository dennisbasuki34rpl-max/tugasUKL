/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnomer3;

import java.util.Scanner;

/**
 *
 * @author LOQ
 */
public class Uklnomer3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int n = input.nextInt();

        long faktorial = 1;
            for (int i = 1; i <= n; i++) {
            faktorial *= i;
           
        }
        System.out.println(" = " + faktorial);
    }
}


