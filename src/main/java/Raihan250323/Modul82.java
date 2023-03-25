/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Raihan250323;

/**
 *
 * @author Acer
 */
public class Modul82 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ArithmeticOperation <number1> <number2>");
            return;
        }
        
        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);

        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = number1 / number2;

        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
    }
}
