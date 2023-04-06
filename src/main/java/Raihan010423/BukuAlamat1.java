/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Raihan010423;

/**
 *
 * @author Acer
 */
public class BukuAlamat1 {
    private int size = 0;
    private BukuAlamatData[] data = new BukuAlamatData[100];
    
    public void addData(BukuAlamatData newData) {
        if(size < data.length) {
            data[size] = newData;
            size++;
        } else {
            System.out.println("Buku alamat sudah penuh!");
        }
    }
    
    public void removeData(int index) {
        if(index >= 0 && index < size) {
            for(int i = index; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
    
    public void displayAllData() {
        if(size == 0) {
            System.out.println("Buku alamat kosong!");
        } else {
            for(int i = 0; i < size; i++) {
                System.out.println("Data " + (i+1) + ":");
                System.out.println("Nama: " + data[i].getNama());
                System.out.println("Alamat: " + data[i].getAlamat());
                System.out.println("Nomor Telepon: " + data[i].getNoTelepon());
                System.out.println("Email: " + data[i].getEmail());
                System.out.println("----------------------");
            }
        }
    }
    
    public void updateData(int index, BukuAlamatData newData) {
        if(index >= 0 && index < size) {
            data[index] = newData;
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
}
