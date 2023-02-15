/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1o1;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese Primer numero");
        int PrimerN = reader.nextInt();
        System.out.println("Ingrese Segundo numero");
        int SegundoN = reader.nextInt();

        if (PrimerN % SegundoN == 0) {

            System.out.println(PrimerN + " Es divisible por " + SegundoN);

        } else {

            System.out.println(PrimerN + " No es divisible por " + SegundoN);
        }

    }

}
