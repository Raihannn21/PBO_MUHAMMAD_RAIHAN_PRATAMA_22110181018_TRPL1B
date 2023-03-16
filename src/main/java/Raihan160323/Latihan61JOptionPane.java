/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Raihan160323;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public class Latihan61JOptionPane {
    public static void main(String[] args) {
    try {
      String nilai1Str = JOptionPane.showInputDialog("Masukkan nilai ujian pertama:");
      double nilai1 = Double.parseDouble(nilai1Str);
      String nilai2Str = JOptionPane.showInputDialog("Masukkan nilai ujian kedua:");
      double nilai2 = Double.parseDouble(nilai2Str);
      String nilai3Str = JOptionPane.showInputDialog("Masukkan nilai ujian ketiga:");
      double nilai3 = Double.parseDouble(nilai3Str);

      double rataRata = (nilai1 + nilai2 + nilai3) / 3.0;
      JOptionPane.showMessageDialog(null, "Rata-rata nilai ujian adalah: " + rataRata);

      if (rataRata >= 60) {
        JOptionPane.showMessageDialog(null, "GOOD JOB");
      } else {
        JOptionPane.showMessageDialog(null, "NICE TRY");
      }
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Input yang dimasukkan bukan angka.");
    }
  }
}
