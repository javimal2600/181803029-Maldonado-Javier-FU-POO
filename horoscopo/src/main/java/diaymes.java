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
public class diaymes {
    public static void main(String[] args){
        System.out.println("HOROSCOPO");
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduce tu dia de nacimiento:");
        int dia=leer.nextInt();
        System.out.println("Introduce tu mes de nacimiento:");
        int mes=leer.nextInt();
        
        switch(mes){
            case 1:
                //enero
                        if(dia>=21){
                            System.out.println("Acuario");
                        }else{
                            System.out.println("Capricornio");
                        }
                break;
            case 2:
                //febrero
                        if(dia>=20){
                            System.out.println("Piscis");
                        }else{
                            System.out.println("Acuario");
                        }
                break;
            case 3:
                //marzo
                        if(dia>=21){
                            System.out.println("Aries");
                        }else{
                            System.out.println("Piscis");    
                        }
                break;
            case 4:
                //abril
                        if(dia>=21){
                            System.out.println("Tauro");
                        }else{
                            System.out.println("Aries");
                        }
                break;
            case 5:
                //mayo
                        if(dia>=22){
                            System.out.println("Geminis");
                        }else{
                            System.out.println("Tauro");
                        }
                break;
            case 6:
                //junio
                       if(dia>=22){
                           System.out.println("Cancer");
                        }else{
                           System.out.println("Geminis");
                       }
                break;
            case 7:
                //julio
                        if(dia>=24){
                            System.out.println("Leo");
                        }else {
                            System.out.println("Cancer");
                        }
                break;
            case 8:
                //agosto
                        if(dia>=24){
                            System.out.println("Virgo");
                        }else {
                            System.out.println("Leo");    
                        }
                break;
            case 9:
                //septiembre
                 if(dia>=24){
                     System.out.println("Libra");
                 }else{
                     System.out.println("Virgo");
                 }
                break;
            case 10:
                //octubre
                    if(dia>=24){
                        System.out.println("Escorpio");
                    }else {
                        System.out.println("Libra");
                    }
                break;
            case 11:
                //noviembre
                if(dia>=23){
                    System.out.println("Sagitario");
                }else {
                    System.out.println("Escorpio");
                }
                break;
            case 12:
                //diciembre
                if(dia>=22){
                    System.out.println("Capricornio");
                }else {
                    System.out.println("Sagitario");
                }
                break;
        }
    }
}
