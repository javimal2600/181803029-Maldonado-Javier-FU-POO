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

    public double total() {
        return this.montoDisponible + this.montoApartado;
    }

    //metodo para un deposito
    public double deposito(double deposito) {
        montoDisponible += deposito;
        return montoDisponible;
    }
    
    //metodo para hacer un retiro
    public double retiro(double retiro) {
        if (retiro <= montoDisponible) {
            montoDisponible -= retiro;
            System.out.println("¡Retiro realizado con exito! \n");
        } else {
            System.out.println("Saldo insuficiente");
        }
        return montoDisponible;
    }

    //metodo para eliminar el apartado
    public void apartado() {
        montoApartado = 0;
    }

    //metodo para mostrar los datos de la cuenta
    @Override
    public String toString() {
        return "\n No.Cuenta:" + noCuenta + " \n NIP:" + nip + "\n CV:" + cv + "\n Nombre: " + nombre + "\n Fecha Vencimiento: " + dia + "/" + mes + "/" + anio + "\n montoDisponible:" + montoDisponible + "\n montoApartado: " + montoApartado + "\n Total:" + this.total();
    }

}
