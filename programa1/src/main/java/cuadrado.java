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
public class cuadrado {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("AREA DE UN CUADRADO");
        double a=0;
        System.out.println("Introduce la medida de un lado del cuadrado:");
        a = leer.nextDouble();
        double resultado= (a*a);
        System.out.println("su resultado es:"+resultado);
    }
}
