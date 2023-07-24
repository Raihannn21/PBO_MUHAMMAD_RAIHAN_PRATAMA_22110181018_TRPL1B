/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raihan.dao;
import java.util.List;
import raihan.model.Anggota;
/**
 *
 * @author Acer
 */
public interface AnggotaDao {
    void insert(Anggota anggota) throws Exception;
    void update(Anggota anggota) throws Exception;
    void delete(Anggota anggota) throws Exception;
    Anggota getAnggota(String kode) throws Exception;
    List<Anggota> getAll() throws Exception;
}

