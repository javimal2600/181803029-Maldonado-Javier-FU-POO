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
public class bono {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("BONOS EL JAVI \n");
        System.out.println("Introduce el bono que te gustaria recibir:");
        float bono= leer.nextFloat();
        System.out.println("Evaluacion del jefe:");
        float jefe=leer.nextFloat();
        float evajefe=((bono*.4f)/10)*jefe;
        System.out.println("Evaluacion de comision:");
        float comi=leer.nextFloat();
        float evacomi=((bono*.1f)/10)*comi;
        System.out.println("Evaluacion del clima laboral:");
        float clima=leer.nextFloat();
        float evaclima=((bono*.1f)/10)*clima;
        System.out.println("Evaluacion de la bitacora:");
        float bita=leer.nextFloat();
        float evabita=((bono*.4f)/10)*bita;
        float total=evajefe+evacomi+evaclima+evabita;
        System.out.println("Resultado del bono a recibir:"+"$"+total);
    }
}
