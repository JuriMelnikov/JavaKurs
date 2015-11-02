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
public class numFormat {
    public static void main(String[] args) {
        System.out.print("Введите трехзначное число: ");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int edinitsi=num%10;
        int desjatki=(num/10)%10;
        int sotni=num/10/10;
        int summ=edinitsi+desjatki+sotni;
        System.out.printf("Единиц в числе: %d%nДесятков в числе:"
                + " %d%nСумма чисел: %d%n",edinitsi, desjatki,summ);
    }
}
