/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier García
 */
public class Ak {
     //atributos del objeto de manera general
    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int danio;
    double velocidadDisparo;

    public Ak(String tipo,int cargador, int precision, double velocidadCarga,double precio,int danio,double velocidadDisparo) {
        this.tipo=tipo;
        this.cargador=cargador;
        this.precision=precision;
        this.velocidadCarga=velocidadCarga;
        this.precio=precio;
        this.danio=danio;
        this.velocidadDisparo=velocidadDisparo;
    }

   
//acciones-metodos, son las acciones o iteraciones del objeto
    public void disparar(){
        System.out.println("Te estoy disparando con un daño de"+this.danio);
    }
    
    public void apuntar(){}
    public void recargar(){}

    
    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ", velocidadCarga=" + velocidadCarga + ", precio=" + precio + ", danio=" + danio + ", velocidadDisparo=" + velocidadDisparo + '}';
    }
}
