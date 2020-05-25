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
public class palabra {
    public static void main(String[] args){
    String data;
    int i=0,j=0;
    Scanner leer = new Scanner(System.in);   
    System.out.println("Ingresa una frase: ");
    data =leer.nextLine();
    for ( i =data.length(), j =data.length(); i>0; i--, j--){   
        System.out.println(data.substring(j-1,i));
    }
 }
}
    
