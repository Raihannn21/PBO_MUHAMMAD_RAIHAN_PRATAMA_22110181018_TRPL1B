/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raihan.model;

/**
 *
 * @author Acer
 */
public class Peminjaman {
    private String KodeAnggota;
    private String Kodebuku ;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman(){}

    public Peminjaman(String KodeAnggota, String Kodebuku, String tglpinjam, String tglkembali) {
        this.KodeAnggota = KodeAnggota;
        this.Kodebuku = Kodebuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }

    public String getKodeAnggota() {
        return KodeAnggota;
    }

    public String getKodebuku() {
        return Kodebuku;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setKodeAnggota(String KodeAnggota) {
        this.KodeAnggota = KodeAnggota;
    }

    public void setKodebuku(String Kodebuku) {
        this.Kodebuku = Kodebuku;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }
}
