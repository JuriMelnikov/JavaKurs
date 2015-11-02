/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class FahrenheitToCelsus {
    public static void main(String[] args) {
        float tF,tC;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Программа переводит температуру в \n"
                + "градусах в шкалу по Фарингейту"
          );
        System.out.print("Введите температуру в градусах Целсия: ");
        tC=scanner.nextFloat();
        tF=9/5*tC+32;
        System.out.printf("%.2f -> %.2f F%n",tC,tF);
                
                
                                
        
    }
}
