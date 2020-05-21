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
public class edad {
    public static void main(String[] args){
         Scanner leer=new Scanner(System.in);
         System.out.println("Calcular la edad actual");
         System.out.println("Introduzca su año de nacimiento:");
         int anio = leer.nextInt();
         System.out.println("Ingrese el año actual:");
         int anio2= leer.nextInt();
         int edad= anio2-anio;
         System.out.println("Su edad actual es:"+edad+"años");
    }
}
