/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.model;

/**
 *
 * @author Acer
 */
public class Pelanggan {
    private String kodePelanggan;
    private String namaPelanggan;
    private String jenisPelanggan;
    
    public Pelanggan() {
        
    }
    
     public Pelanggan (String kodePelanggan, String namaPelanggan, String jenisPelanggan) {
        this.kodePelanggan = kodePelanggan;
        this.namaPelanggan = namaPelanggan;
        this.jenisPelanggan = jenisPelanggan;
    }
    public String getkodePelanggan() {
        return kodePelanggan;
    }
    
    public void setkodePelanggan(String kodePelanggan){
        this.kodePelanggan = kodePelanggan;
    }
    
    public String getnamaPelanggan() {
        return namaPelanggan;
    }
    
    public void setnamaPelanggan(String namaPelanggan){
        this.namaPelanggan = namaPelanggan;
    }
    
    public String getjenisPelanggan() {
        return jenisPelanggan;
    }
    
     public void setjenisPelanggan(String jenisPelanggan){
        this.jenisPelanggan = jenisPelanggan;
    }
 
}

