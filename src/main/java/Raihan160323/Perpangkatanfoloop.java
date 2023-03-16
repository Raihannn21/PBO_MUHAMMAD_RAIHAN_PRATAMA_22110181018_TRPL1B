/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Raihan160323;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Perpangkatanfoloop {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan angka: ");
    int angka = in.nextInt();
    System.out.print("Masukkan pangkat: ");
    int pangkat = in.nextInt();
    int hasil = 1;
    for (int i = 1; i <= pangkat; i++) {
      hasil *= angka;
    }
    System.out.println(angka + " pangkat " + pangkat + " = " + hasil);
  }
}
