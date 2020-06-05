/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier García
 */
public class Tarjetas {

    int noCuenta;
    int nip;
    int cv;
    String nombre;
    int dia;
    int mes;
    int anio;
    double montoDisponible;
    double montoApartado;

    //constructor vacio
    public Tarjetas() {
    }

    //constructor con parametros
    public Tarjetas(int noCuenta, int nip, int cv, String nombre, int dia, int mes, int anio, double montoDisponible, double montoApartado) {
        this.noCuenta = noCuenta;
        this.nip = nip;
        this.cv = cv;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.montoDisponible = montoDisponible;
        this.montoApartado = montoApartado;
    }

    //1 public no le haremos caso
    //2 que tipo se va a regresar en este caso(Tarjetas)
    //3 Es el nombre
    //4 los valores que recibe el metodo
    public Tarjetas verificarCuenta(int noCuenta, int nip) {
        if (noCuenta == 123123 && nip == 1133) {

            return new Tarjetas(123123, 1133, 543, "Eduardo Diaz Flores", 31, 12, 2032, 45987.22, 550);

        } else if (noCuenta == 456789 && nip == 3367) {

            return new Tarjetas(456789, 3367, 544, "Kevin Mesa Gonzalez", 31, 12, 2032, 360, 5322.23);

        } else {
            return new Tarjetas();
        }
    }
   
    //metodo para un deposito
    public void deposito(double deposito) {
        this.montoDisponible = this.montoDisponible+deposito;
    }   
    
    //metodo para verificar antes de hacer un retiro
    public void verificarRetiro(double retiro) {
        if (retiro <= this.montoDisponible) {
            retiro(retiro);
            System.out.println("¡Retiro realizado con exito! \n");
        } else {
            System.out.println("Saldo insuficiente \n");
        }
    }

    //metodo para hacer el retiro
    public void retiro(double retiro){
        this.montoDisponible = this.montoDisponible - retiro;
    }
    
    //metodo para eliminar el apartado
    public void apartado() {
        this.montoDisponible=this.montoDisponible + this.montoApartado;
        this.montoApartado = 0;   
    }
    
    //verificar el apartado
    public void verificarApartado(double apartado){
        if(apartado <= this.montoDisponible){
            crearApartado(apartado);
            System.out.println("!Apartado Creado con exito¡");
        }else{
            System.out.println("No cuenta con saldo suficiente");
        }
    }
    
    //metodo para crear un apartado
    public void crearApartado(double apartado){
        this.montoApartado=this.montoApartado+apartado;
        this.montoDisponible=this.montoDisponible-this.montoApartado;
    }
    
     //metodo para hacer el total
    public double total() {
        return this.montoDisponible + this.montoApartado;
    }

    //metodo para mostrar los datos de la cuenta
    @Override
    public String toString() {
        return "\n No.Cuenta:" + noCuenta + " \n NIP:" + nip + "\n CV:" + cv + "\n Nombre: " + nombre + "\n Fecha Vencimiento: " + dia + "/" + mes + "/" + anio + "\n montoDisponible:" + this.montoDisponible + "\n montoApartado: " + montoApartado + "\n Total:" + this.total();
    }
}