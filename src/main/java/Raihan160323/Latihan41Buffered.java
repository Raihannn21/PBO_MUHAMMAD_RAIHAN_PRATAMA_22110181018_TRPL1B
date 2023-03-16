/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Raihan160323;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Acer
 */
public class Latihan41Buffered {
   public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int number1 = 10;
    int number2 = 20;
    int number3 = 45;
    
    double average = (number1 + number2 + number3) / 3.0;
    
    System.out.println("number 1 = " + number1);
    System.out.println("number 2 = " + number2);
    System.out.println("number 3 = " + number3);
    System.out.println("Average is = " + average);
  }
}
