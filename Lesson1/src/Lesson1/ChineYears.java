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
public class ChineYears {

    static enum Cicles {

        ЗЕЛЕНЫЙ, КРАСНЫЙ, ЖЕЛТЫЙ, БЕЛЫЙ, ЧЕРНЫЙ
    }

    static enum Years {

        КРЫСА, КОРОВА, ТИГР, КРОЛИК, ДРАКОН, ЗМЕЯ, ЛОШАДЬ, ОВЦА, ОБЕЗЬЯНА, ПЕТУХ, СОБАКА, СВИНЬЯ
    }

    /**
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Программа определит живоное и цвет года по китайскому календарю.");
        System.out.print("Введите год: ");
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        int god60Cicla = (year + 116) % 60;
        int god12Cicla = god60Cicla % 12;
        Years animal=Years.values()[god12Cicla];
        System.out.println("");
        int tsvet = god60Cicla / 2 % 5;
        Cicles color=Cicles.values()[tsvet];
        System.out.printf("Животное %d года - %s,  цвет - %s%n", year,animal,color);
        
    }
}
