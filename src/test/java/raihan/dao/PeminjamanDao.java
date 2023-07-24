/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raihan.dao;
import raihan.model.*;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Acer
 */
public interface PeminjamanDao {
    void insert (Peminjaman peminjaman)throws SQLException;
    void update (Peminjaman peminjaman)throws SQLException;
    void delete (Peminjaman peminjaman)throws SQLException;
    Peminjaman getPeminjaman(String kodeAnggota, String Kodebuku, String Tglpinjam)throws SQLException, Exception;
    List<Peminjaman> getAll() throws SQLException;
}
