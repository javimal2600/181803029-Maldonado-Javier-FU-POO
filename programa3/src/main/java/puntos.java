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
public class puntos {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Calcular la distancia de dos puntos");
        int x1,x2,y1,y2;
        System.out.println("introduce el valor de x1:");
        x1=leer.nextInt();
        System.out.println("introduce el valor de y1:");
        y1=leer.nextInt();
        System.out.println("introduce el valor de x2:");
        x2=leer.nextInt();
        System.out.println("Introduce el valor de y2:");
        y2=leer.nextInt();
        float resultado=(float)(Math.sqrt((((((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)))))));
        System.out.println("La distancia de los dos puntos es: "+resultado);
    }
}
