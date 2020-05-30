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
public class tarjetasMain {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        Tarjetas tarjeta=new Tarjetas();
      
        int noCuenta, nip;
        System.out.println("Ingresa tu numero de cuenta:");
        noCuenta=leer.nextInt();
        System.out.println("Ingresa tu NIP");
        nip=leer.nextInt();
        tarjeta.verificarCuenta(noCuenta, nip);
        System.out.println("\n"+tarjeta.nombre);
        
        
    }
}
