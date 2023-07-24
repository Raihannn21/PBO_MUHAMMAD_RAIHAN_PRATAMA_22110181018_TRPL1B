/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raihan.db;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;
import javax.swing.JOptionPane;
import raihan.dao.*;
import raihan.model.*;


/**
 *
 * @author Acer
 */
public class DbHelper {
    private static Connection connection;
    
    public static Connection getConnection () throws SQLException {
        if(connection==null){
            MysqlDataSource dataSource = new MysqlConnectionPoolDataSource();
            dataSource.setURL("jdbc:mysql://localhost/PBO_2211081018");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static void main(String[] args) throws Exception {
        try {
            connection = DbHelper.getConnection();
            AnggotaDao dao = new AnggotaDaolmpl(connection);
            Anggota anggota=new Anggota("A002", "RAIHAN", "PADANG", "L" );
            dao.insert(anggota);
            JOptionPane.showMessageDialog(null, "Entri Data OK");
        }catch(SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.getMessage());
           
        }
    }   
}
