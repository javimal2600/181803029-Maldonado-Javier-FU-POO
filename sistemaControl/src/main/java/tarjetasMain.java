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
        //declarando al programa que usare un objeto de tipo Tarjetas
        Tarjetas tarjeta;

        int noCuenta, nip;
        System.out.println("Ingresa tu numero de cuenta:");
        noCuenta = leer.nextInt();
        System.out.println("Ingresa tu NIP");
        nip = leer.nextInt();
        //al mismo tiempo que estoy instanciando llamo el metodo verificarCuenta
        tarjeta = new Tarjetas().verificarCuenta(noCuenta, nip);
        //System.out.println(tarjeta.toString());

        System.out.println("\n");

        System.out.println("Tu nombre es: " + tarjeta.nombre);
        //menu
        int opc;
        do {
            System.out.println("1) Hacer un deposito");
            System.out.println("2) Hacer un retiro");
            System.out.println("3) Eliminar apartado");
            System.out.println("4) Imprimir datos de la cuenta");
            System.out.println("5) Salir");
            System.out.println("Escoge una opcion:");
            opc = leer.nextInt();
            System.out.println("\n");
            switch (opc) {
                case 1:
                    System.out.println("Introduzca la cantidad a depositar:");
                    double deposito = leer.nextDouble();
                    tarjeta.deposito(deposito);
                    System.out.println("¡Deposito realizado con exito! \n");
                    break;
                case 2:
                    System.out.println("Introduzca la cantida a retirar:");
                    double retiro = leer.nextDouble();
                    tarjeta.retiro(retiro);
                    break;
                case 3:
                    System.out.println("Eliminando Apartado... \n");
                    tarjeta.apartado();
                    System.out.println("!Apartado eliminado con exito¡ \n");
                    break;
                case 4:
                    System.out.println(tarjeta.toString());
                    System.out.println("\n");
                    break;
            }
        } while (opc != 5);
        System.out.println("¡Gracias vuelva pronto!");
    }
}

