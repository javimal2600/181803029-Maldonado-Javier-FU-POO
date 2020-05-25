/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */
import java.util.*;
import java.util.Scanner;
public class teorema {
     public static void main(String[] args){
         Scanner leer = new Scanner(System.in);
         System.out.println("TEOREMA DE PITAGORAS");
         float cata=0,cato=0,hipo=0;
         int opc=0;
         System.out.println("¿Que desea calcular?:");
         System.out.println("1)Cateto Opuesto");
         System.out.println("2)Cateto Abyacente");
         System.out.println("3)Hipotenusa");
         opc=leer.nextInt();
         switch(opc){
             case 1:
                    System.out.println("Introduzca el valor de la Hipotenusa:");
                    hipo=leer.nextFloat();
                    System.out.println("Introduzca el valor del cateto abyacente:");
                    cata=leer.nextFloat();
                    if(hipo>cata){
                        cato=(float) Math.sqrt((hipo*hipo)-(cata*cata));
                        System.out.println("El resultado es:"+cato);
                    }else{
                        System.out.println("Recuerde que la hipotenusa es el lado mas grande");
                        System.out.println("Introduce otra vez la hipotenusa:");
                        hipo=leer.nextFloat();
                        cato=(float) Math.sqrt((hipo*hipo)-(cata*cata));
                        System.out.println("El resultado es:"+cato);
                    }
                 break;
             case 2:
                    System.out.println("Introduzca el valor de la hipotenusa");
                     hipo=leer.nextFloat();
                    System.out.println("Introduzca el valor del cateto opuesto:");
                    cato=leer.nextFloat();
                    if(hipo>cato){
                        cata=(float) Math.sqrt((hipo*hipo)-(cato*cato));
                        System.out.println("El resultado es:"+cato);
                    }else{
                        System.out.println("Recuerde que la hipotenusa es el lado mas grande");
                        System.out.println("Introduce otra vez la hipotenusa:");
                        hipo=leer.nextFloat();
                        cata=(float) Math.sqrt((hipo*hipo)-(cato*cato));
                        System.out.println("El resultado es:"+cata);
                    }
                 break;
             case 3:
                    System.out.println("Introduzca el valor del cateto opuesto:");
                    cato=leer.nextFloat();
                    System.out.println("Introduzca el valor del cateto Adyacente:");
                    cata=leer.nextFloat();
                    hipo=(float) Math.sqrt((cata*cata)+(cato*cato));
                    System.out.println("La hipotenusa es de:"+hipo);
                 break;
         }
     }
}
