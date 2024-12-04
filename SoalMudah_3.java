/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soalmudah_3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SoalMudah_3 {

    public static void main(String[] args) {
        for (int a = 50; a >= 1; a--) {
            if (a == 1) {

                System.out.println(a + ". saya senang");
            } else if (a % 3 == 0) {
                System.out.println(a + ". saya angkatan 33");
            } else if (a % 2 == 0) {
                System.out.println(a + ". saya anak moklet");

            } else {
                System.out.println(a + ". saya anak wikusama");
            }
        }
    }
}

