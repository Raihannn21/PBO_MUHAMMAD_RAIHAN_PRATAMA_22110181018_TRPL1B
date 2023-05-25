/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.model;

/**
 *
 * @author Acer
 */
public class Warnet {
    private Pelanggan pelanggan;
    private String tglMasuk;
    private int jamMasuk;
    private int jamKeluar;
    private double tarif = 10000;
    
    public Warnet() {
        
    }
    public Warnet(Pelanggan pelanggan, String tglMasuk, int jamMasuk, int jamKeluar, double tarif){
        this.pelanggan = pelanggan;
        this.tglMasuk = tglMasuk;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
        this.tarif = tarif;
    }
     
    public Pelanggan getpelanggann() {
        return pelanggan;
    }
    
    public void setpelanggann(Pelanggan pelanggan){
        this.pelanggan = pelanggan;
    }
    
    public String gettglMasuk() {
        return tglMasuk;
    }
    
    public void settglMasuk(String tglMasuk){
        this.tglMasuk = tglMasuk;
    }
    
    public int getjamMasuk() {
        return jamMasuk;
    }
    
    public void setjamMasuk(int jamMasuk){
        this.jamMasuk = jamMasuk;
    }
    
    public int getjamKeluar() {
        return jamKeluar;
    }
    
    public void setjamKeluar(int jamKeluar){
        this.jamKeluar = jamKeluar;
    }
    
    public double gettarif() {
        return tarif;
    }
    
    public void setgettarif(double tarif){
        this.tarif = tarif;
    }
    
     public double calculateTotalBayar() {
        int lama = jamKeluar - jamMasuk;
        double diskon = 0;
        
        if ((pelanggan.getjenisPelanggan().equals("VIP") || pelanggan.getjenisPelanggan().equals("GOLD")) && lama > 2) {
            diskon = 0.02 * tarif;
        }
        
        double totalBayar = lama * tarif - diskon;
        return totalBayar;
    }
}
