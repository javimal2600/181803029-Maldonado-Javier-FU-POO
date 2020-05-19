/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier García
 */
public class tipo_variable {
    public static void main(String[] args){
    //Tipos de variables
    /*Fuertemenete tipado
    Debemos declarar el tipo de variables  que es y esta siempre en el programa mantendra este tipo
    Una variable  no puede pasar facilmente a ser de otro tipo
    Castear el convertir una variable de un tipo a otro
    */
    //variables numericos
    int a=10, b=2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    //variables flotantes
    float c=4.67f;
    double pi=3.14;
    //cambios de variables 
    boolean bandera=true;
    //variables de caracteres
    char letra='a';
    String palabra="Hola mundo";
    System.out.println(palabra);
    //concatenar 
        System.out.println("valor de pi:"+pi);
        System.out.println("valor de la palabra"+palabra);
        System.out.println("valores:"+(a*b));
  }
}
