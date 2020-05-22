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
         System.out.println("REGLA DE TRES");
         System.out.println("Valor obtenido:");
         float a=leer.nextFloat();
         System.out.println("Valor total:");
         float b=leer.nextFloat();
         float resultado=(float)((a/b)*100);
         System.out.println("El porcentaje es: "+resultado+"%");
         
     }
}
