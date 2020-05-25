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
public class triangulo {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Triangulo Rectangulo");
        int i,j,n;
        System.out.println("Ingrese la dimension del triangulo:");
        n=leer.nextInt();
        System.out.println("\n"); 
        for(i=1;i<=n;i++){
            for(j=0;j!=i;j++){
                System.out.print(j+1+" ");
            }
           System.out.println("\n"); 
        }
    }
}
