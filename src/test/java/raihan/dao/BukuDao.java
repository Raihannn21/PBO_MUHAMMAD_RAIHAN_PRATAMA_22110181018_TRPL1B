/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raihan.dao;
import raihan.model.*;
import java.util.List;
/**
 *
 * @author Acer
 */
public interface BukuDao {
    void insert (Buku buku) throws Exception;
    void update (Buku buku) throws Exception;
    void delete (Buku buku) throws Exception;
    Buku getBuku(String Kodebuku)throws Exception;
    List<Buku> getAll() throws Exception;
}
