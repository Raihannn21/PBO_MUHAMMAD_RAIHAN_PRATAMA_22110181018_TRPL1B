/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Raihan010423;

/**
 *
 * @author Acer
 */
public class BukuAlamat {
     private String nama;
    private String alamat;
    private String no_telepon;
    private String email;
    
    public BukuAlamat(String nama, String alamat, String no_telepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.no_telepon = no_telepon;
        this.email = email;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setNoTelepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }
    
    public String getNoTelepon() {
        return this.no_telepon;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return this.email;
    }
}
