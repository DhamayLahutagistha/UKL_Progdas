/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soalsedang_1;

/**
 *
 * @author LENOVO
 */
public class SoalSedang_1 {

    public static void main(String[] args) {
        int tabunganBulanPertama = 100000;
        int totalTabungan = 0;
        int tabunganBulanan = tabunganBulanPertama;

        for (int bulan = 1; bulan <= 24; bulan++) {
            totalTabungan += tabunganBulanan;
            System.out.println("Bulan " + bulan + ": Rp " + tabunganBulanan);
            tabunganBulanan += 50000;
        }
        System.out.println("Total tabungan selama 24 bulan: Rp " + totalTabungan);
    }
}
