/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21task2tatjanasubbotina;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV21Task2TatjanaSubbotina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int x, y, z;
        System.out.println("Vvedite trekhznachnoe chislo: ");
        Scanner scanner = new Scanner(System.in);
        int zyx = scanner.nextInt();
        x = zyx % 10;
        y = (zyx - x) / 10 % 10;
        z = (zyx - y * 10 - x) / 100;
        System.out.printf("\nSumma tsifr ravna = %d%n",z+y+x);
    }
    
}
