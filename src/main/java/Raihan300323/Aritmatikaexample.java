/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Raihan300323;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
import Raihan300323.Aritmatika1;
public class Aritmatikaexample {
    public static void main(String[] args) {
        Aritmatika1 arit = new Aritmatika1();
        int hasil = arit.tambah(7, 6);
        System.out.println("Hasil Penjumlahan : " + hasil);
        arit.cekganjil(hasil);
        int n = arit.inputN();
        int[] ganjil = arit.nganjil(n);
        System.out.print("Bilangan ganjil pertama: ");
        for (int i = 0; i < ganjil.length; i++) {
            System.out.print(ganjil[i] + " ");
    }
        System.out.println();
        System.out.println("Masukkan bilangan: ");
        Scanner in = new Scanner(System.in);
        int bilangan = in.nextInt();
        if (arit.cekprima(bilangan)) {
            System.out.println(bilangan + " adalah bilangan prima");
        } else {
            System.out.println(bilangan + " bukan bilangan prima");
        }
}
}