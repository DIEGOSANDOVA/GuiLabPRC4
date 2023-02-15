/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1o2;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class IngresodeNotas {
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        
        int notaAlumn;
        
        System.out.println("Ingrese la nota del alumno");
        notaAlumn = reader.nextInt();

        if (notaAlumn >= 7.0 ) 
            {
                System.out.println("El alumno a aprobado la Materia");
            }
            else
              if(notaAlumn <6.49)
            {
               System.out.println("El alumno a Reprobado la Materia"); 
            }
        if(notaAlumn >=6.5 && notaAlumn <=6.99)
            {
                System.out.println("Tiene la posibilidad de realizar un examen de suficiencia para aprobar.");
            }
        }
}
