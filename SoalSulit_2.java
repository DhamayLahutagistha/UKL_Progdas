/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soalsulit_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SoalSulit_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positifList = new ArrayList<>();

        System.out.println("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Masukkan elemen array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int num : array) {
            if (num > 0) {
                positifList.add(num);
            }
        }
        if (positifList.isEmpty()) {
            System.out.println("Array tidak mengandung elemen positif.");
        } else {
            System.out.print("Array mengandung elemen positif: ");
            for (int positif : positifList) {
                System.out.print(positif + " ");
            }
            System.out.println();
        }
    }
}
