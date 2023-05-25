/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Acer
 */
public class WarnetDaoImpl implements WarnetDao {
     List<Warnet> data = new ArrayList<>();
     
     public WarnetDaoImpl(){
        data.add(new Warnet("1111", "ALEN", "GOLD"));
        data.add(new Warnet("1112", "RIZKY", "VIP"));
        data.add(new Warnet("1113", "ANSOR", "GOLD"));
    }
}
