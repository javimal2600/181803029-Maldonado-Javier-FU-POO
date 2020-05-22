/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier García
 */
import java.util.*;
import java.util.Scanner;
public class regladetres {
     public static void main(String[] args){
         Scanner leer=new Scanner(System.in);
         System.out.println("REGLA DE TRES SIMPLE");
         System.out.println("Valor de referencia:");
         float a=leer.nextFloat();
         System.out.println("Valor de magnitud:");
         float b=leer.nextFloat();
         System.out.println("Valor que desea saber en base a los dos datos anteriores:");
         float c=leer.nextFloat();
         float x=((b*c)/a);
         System.out.println("El resultado es: " + x);
     }
}
