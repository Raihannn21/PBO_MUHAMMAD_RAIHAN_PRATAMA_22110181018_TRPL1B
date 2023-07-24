/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raihan.model;

/**
 *
 * @author Acer
 */
public class Buku {
    private String Kodebuku;
    private String Judulbuku;
    private String Pengarang;
    private String Penerbit;
    
    public Buku(){    
    }
    
    public Buku(String Kodebuku, String Judulbuku, String Pengarang, String Penerbit) {
        this.Kodebuku = Kodebuku;
        this.Judulbuku = Judulbuku;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
    }

    public String getKodebuku() {
        return Kodebuku;
    }

    public String getJudulbuku() {
        return Judulbuku;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setKodebuku(String Kodebuku) {
        this.Kodebuku = Kodebuku;
    }

    public void setJudulbuku(String Judulbuku) {
        this.Judulbuku = Judulbuku;
    }

    public void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }
}
