/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.controller;
import UTS_A.view.FormPelanggan;
import UTS_A.model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Acer
 */
public class PelangganController {
    private FormPelanggan formPelanggan;
    private PelangganDao PelangganDao;
    private Pelanggan Pelanggan;
    public PelangganController (FormPelanggan formPelanggan){
        this.formPelanggan = formPelanggan;
        PelangganDao = new PelangganDaoImpl();
    }
}

