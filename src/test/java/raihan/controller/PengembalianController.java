/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raihan.controller;

import java.sql.Connection;
import java.util.List;

import raihan.dao.*;
import raihan.model.*;
import raihan.view.FormPengembalian;
import raihan.db.DbHelper;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class PengembalianController {
   private FormPengembalian view;
   private AnggotaDao Adao;
   private BukuDao Bdao;
   private PengembalianDao pengembalianDao;
   private Pengembalian kembali;
   private Connection con;

    public PengembalianController (FormPengembalian view) throws Exception {
        this.view = view;
        con = DbHelper.getConnection();
        Adao = new AnggotaDaolmpl(con);
        Bdao = new BukuDaolmpl(con);
        pengembalianDao = new PengembalianDaolmpl(con);
        kembali = new Pengembalian();
    }
    
    public void bersih() {
        
       try {
           view.getBtnkembalikan().setEnabled(false);
           List<Anggota> alist = Adao.getAll();
           view.getCbokodeanggota().removeAllItems();
           for(Anggota anggota : alist){
               view.getCbokodeanggota().addItem(anggota.getKodeanggota());
           }
           view.getCbokodeanggota().setSelectedIndex(0);
           
           List<Buku> blist = Bdao.getAll();
           view.getCbokodebuku().removeAllItems();
           for(Buku buku  : blist){
               view.getCbokodebuku().addItem(buku.getKodebuku());
           }
           view.getCbokodeanggota().setSelectedIndex(0);

           view.getTxttglpinjam().setText("");
           view.getTxttgldikembalikan().setText("");
           view.getTxtcari().setText("");
           view.getTxtterlambat().setText("");
           view.getTxtdenda().setText("");
       } catch (Exception ex) {
           Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
     public void insert() {
        try {
            kembali.setKodeAnggota(view.getCbokodeanggota().getSelectedItem().toString());
            kembali.setKodebuku(view.getCbokodebuku().getSelectedItem().toString());
            kembali.setTglpinjam(view.getTxttglpinjam().getText());
            kembali.setTglkembali(view.getTxttgldikembalikan().getText());
            kembali.setTerlambat(Integer.parseInt(view.getTxtterlambat().getText()));
            kembali.setDenda(Double.parseDouble(view.getTxtdenda().getText()));
            pengembalianDao.insert(kembali);
            JOptionPane.showMessageDialog(view, "Berhasil Kembalikan Buku.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Tidak bisa melakukan pengembalian!", null, 0);
        }
    }
    
    public void update() {  
        try {
            kembali.setKodeAnggota(view.getCbokodeanggota().getSelectedItem().toString());
            kembali.setKodebuku(view.getCbokodebuku().getSelectedItem().toString());
            kembali.setTglpinjam(view.getTxttglpinjam().getText());
            kembali.setTglkembali(view.getTxttgldikembalikan().getText());
            kembali.setTerlambat(Integer.parseInt(view.getTxtterlambat().getText()));
            kembali.setDenda(Double.parseDouble(view.getTxtdenda().getText()));
            pengembalianDao.update(kembali);
            JOptionPane.showMessageDialog(view, "Berhasil update Buku.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Tidak bisa melakukan pengembalian!", null, 0);
        }
    }
     public void delete() {
        try {
            kembali.setKodeAnggota(view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 0)
                    .toString());
            kembali.setKodebuku(view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 2)
                    .toString());
            kembali.setTglpinjam(view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 4)
                    .toString());
            pengembalianDao.delete(kembali);
            JOptionPane.showMessageDialog(view, "Data pengembalian dihapus!", null, 2);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
     public void get() {
        try {
            view.getBtnkembalikan().setEnabled(true);
            String tglPinjam = view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 4)
                    .toString();
            String tglkembali = view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 5)
                    .toString();
            view.getCbokodeanggota()
                    .setSelectedItem(view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 0)
                            .toString());
            view.getCbokodebuku()
                    .setSelectedItem(view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 2)
                            .toString());
            view.getTxttglpinjam()
                    .setText(tglPinjam);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String tglDikembalikan = format.format(new java.util.Date());
            view.getTxttgldikembalikan().setText(tglDikembalikan);
            int terlambat = pengembalianDao.selisihtgl(tglDikembalikan, tglkembali);
            kembali.setTerlambat(terlambat);
            view.getTxtterlambat().setText("" + terlambat);
            view.getTxtdenda().setText((String.valueOf(kembali.getDenda())));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e, null, 0);
        }
    }
    
     public void tampil() {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) view.getTblpengembalian().getModel();
            tableModel.setRowCount(0);
            List<Pengembalian> List = pengembalianDao.getAll();
            for (Pengembalian kembali : List) {
                Object[] data = {
                        kembali.getKodeAnggota(),
                        kembali.getNamaAnggota(),
                        kembali.getKodebuku(),
                        kembali.getJudulBuku(),
                        kembali.getTglpinjam(),
                        kembali.getTglkembali(),
                        kembali.getDikembalikan(),
                        kembali.getTerlambat(),
                        kembali.getDenda()
                };
                tableModel.addRow(data);
            }
        } catch (Exception e) {
            // DO: handle exception
            JOptionPane.showMessageDialog(view, e);
        }
    }

    public void Cari() {
        try {
            String kode = view.getCbopilih().getSelectedItem().toString();
            String cari = view.getTxtcari().getText();
            DefaultTableModel tableModel = (DefaultTableModel) view.getTblpengembalian().getModel();
            tableModel.setRowCount(0);
            if(kode == "KodeAnggota"){
                kode = "anggota.KodeAnggota";
            }else if(kode == "KodeBuku"){
                kode = "buku.Kodebuku";
            }else{
                kode = "anggota.namaAnggota";
            }
            List<Pengembalian> List = pengembalianDao.cari(kode, cari);
            if (List.isEmpty()) {
             if (kode.equals("anggota.kodeAnggota")) {
                JOptionPane.showMessageDialog(view, "KodeAnggota '" + cari + "' Tidak dapat ditemukan"); 
            } else if (kode.equals("buku.KodeBuku")) {
                JOptionPane.showMessageDialog(view, "Kodebuku '" + cari + "' Tidak dapat ditemukan");   
            } else {
                JOptionPane.showMessageDialog(view, "NamaAnggota '" + cari + "' Tidak dapat ditemukan");   
            }

            } else {
                for (Pengembalian kembali : List) {
                    Object[] data = {
                        kembali.getKodeAnggota(),
                        kembali.getNamaAnggota(),
                        kembali.getKodebuku(),
                        kembali.getJudulBuku(),
                        kembali.getTglpinjam(),
                        kembali.getTglkembali(),
                        kembali.getDikembalikan(),
                        kembali.getTerlambat(),
                        kembali.getDenda()
                    };
                    tableModel.addRow(data);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e, null, 0);
        }
    }

    public int tanggalDikembalikan() throws Exception {
        String tglDikembalikan = view.getTxttgldikembalikan().getText();
        String Tglkembali = view.getTblpengembalian().getValueAt(view.getTblpengembalian().getSelectedRow(), 5)
                .toString();
        int terlambat = pengembalianDao.selisihtgl(tglDikembalikan, Tglkembali);
        if(terlambat <= 0){
            terlambat = 0;
        }
        view.getTxtterlambat().setText("" + terlambat);
        view.getTxttgldikembalikan().setText(tglDikembalikan);
        view.getTxtdenda().setText((String.valueOf(terlambat * 2000)));
        return terlambat;
    }

}
