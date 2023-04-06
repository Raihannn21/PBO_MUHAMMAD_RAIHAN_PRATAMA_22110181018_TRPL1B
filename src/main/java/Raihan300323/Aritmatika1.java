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
public class Aritmatika1 {
    public int tambah(int a, int b) {
        return a + b;
    }

    public void cekganjil(int a) {
        if (a % 2 == 1) {
            System.out.println(a + " adalah bilangan ganjil");
        } else {
            System.out.println(a + " adalah bilangan genap");
        }
    }
    public int[] nganjil(int n) {
        int[] ganjil = new int[n];
        int j = 1;
        for (int i = 0; i < n; i++) {
            ganjil[i] = j;
            j += 2;
        }
        return ganjil;
    }
    public int inputN() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = in.nextInt();
        in.close();
        return n;
    }
    public boolean cekprima(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

}

