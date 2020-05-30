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
    public Tarjetas(){}
    //constructor con parametros
    public Tarjetas(int noCuenta,int nip,int cv,String nombre,int dia, int mes, int anio,double montoDisponible,double montoApartado){
        this.noCuenta=noCuenta;
        this.nip=nip;
        this.cv=cv;
        this.nombre=nombre;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.montoDisponible=montoDisponible;
        this.montoApartado=montoApartado;
        
    }
   
    //
    public void verificarCuenta(int noCuenta,int nip){
        if(noCuenta==123123 && nip==1133){
            System.out.println("Eres la cuenta de Eduardo Diaz Flores");
            Tarjetas eduardo=new Tarjetas(123123,1133,543,"Eduardo Diaz Flores",31,12,2032,45987.22,550);
            System.out.print(eduardo.toString());
        }else if(noCuenta==456789 && nip== 3367){
            System.out.println("Eres la cuenta de Kevin Mesa Gonzalez");
            Tarjetas kevin=new Tarjetas(456789,3367,544,"Kevin Mesa Gonzalez",31,12,2032,360,5322.23);
            System.out.print(kevin.toString());
        }else{
            System.out.println("No estas registrados");
        }
    }
    
     public double total (){
        return this.montoDisponible+this.montoApartado;
    }

    @Override
    public String toString() {
        return  "\n No.Cuenta:" + noCuenta + " \n NIP: " + nip + "\n CV:" + cv + "\n Nombre: " + nombre + "\n Fecha Vencimiento: " + dia + "/" + mes + "/" + anio + "\n montoDisponible:" + montoDisponible + "\n montoApartado: " + montoApartado+"\n Total:"+this.total();
    }
    
}   

