


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */
public class Aviso {
    int matricula=0;
    String titulo="";
    String persona="";
    String texto="";
    String resumen="";
    String publicacion="";
    String alta;
    String baja;
    String status="";
    String tipoAviso="";

    @Override
    public String toString() {
        return "Aviso \n" + "Aviso No." + matricula + "\n Titulo: " + titulo + "\n Publicó: " + persona + "\n Texto del aviso: " + texto + "\n Resumen: " + resumen + "\n Fecha de publicacion: " + publicacion + "\n Fecha de alta: " + alta + "\n Fecha de baja: " + baja + "\n Status: " + status + "\n Tipo de aviso: " + tipoAviso + "";
    }
    
    
}
