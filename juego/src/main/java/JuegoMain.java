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
public class JuegoMain {
     public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
       
        //aqui se crean nuestros personajes
        Personaje p1 = new Personaje("Javier");
        Personaje p2 = new Personaje("Carlos");
        
        //menu de armas
        System.out.println("Menu de armas:\n");
        System.out.println("1) Bronce");
        System.out.println("2) Plata");
        System.out.println("3) Oro");
        System.out.println("4) Diamante");
        System.out.println("5) Adamantium");
        System.out.println("\n");
         
        //seleccion de armas para ambos jugadores
        System.out.println("Player 1 seleccione un arma:");
        p1.equiparArma(leer.nextInt());
        System.out.println("\n");
        System.out.println("Player 2 seleccione un arma:");
        p2.equiparArma(leer.nextInt());
        System.out.println(p1);
        
        //mostrar los datos de los personajes:
         System.out.println(p1.toString()+"\n");
         System.out.println(p2.toString());
        
        //mostrar el daño que hace cada arma
         System.out.println(p1.mostrarDanio());
         System.out.println(p2.mostrarDanio());
     }
}
