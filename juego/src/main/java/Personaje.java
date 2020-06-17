/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */
public class Personaje {
    int vida;
    String nombre;
    Ak arma;

    public Personaje() {
        this.vida=100;
    }

    public Personaje(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    public void equiparArma(int valor){
        switch(valor){
            case 1:
                this.arma=new Ak("Bronce",5,75,5,1000,10,10);
                break;
            case 2:
                this.arma=new Ak("plata",8,70,4.5,2300,11,15);
                break;
            case 3:
                this.arma=new Ak("oro",10,85,3.5,2500,13,20);
                break;
            case 4:
                this.arma=new Ak("diamante",20,95,4,4000,20,25);
                break;
            case 5:
                this.arma=new Ak("adamantium",30,100,1,10000,27,30);
                break;
        }
    }

    public String mostrarDanio(){
        return "Tu arma tiene un daño de:"+arma.danio;
    }
    
    @Override
    public String toString() {
        return "Personaje: \n" + "\n vida:" + vida + "\n nombre:" + nombre + "\n arma:" + arma ;
    }
    
    
}
