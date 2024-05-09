/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdos;

/**
 *
 * @author Windows 10
 */
public class Socio {
    private int documento;
    private String nombre;
    private int tipoCuota;
    private int cantidadAdicionales;

    public Socio(int documento, String nombre, int tipoCuota, int cantidadAdicionales) {
        this.documento = documento;
        this.nombre = nombre;
        this.tipoCuota = tipoCuota;
        this.cantidadAdicionales = cantidadAdicionales;
    }
   


    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoCuota() {
        return tipoCuota;
    }

    public void setTipoCuota(int tipoCuota) {
        this.tipoCuota = tipoCuota;
    }

    public int getCantidadAdicionales() {
        return cantidadAdicionales;
    }

    public void setCantidadAdicionales(int cantidadAdicionales) {
        this.cantidadAdicionales = cantidadAdicionales;
    }


    /* public String tieneAdicional()
    {
        String adicional="";
        if(this)
            adicional="Si";
        else
            adicional="No";
        return adicional;
    }*/

        public String tipoDeCuota()
    {
        String cuota="";
        
        if(this.tipoCuota==1){cuota="Basica";}
        else if(this.tipoCuota==2){cuota="Mejorada";}
        else
            cuota="Full";
        return cuota;
    }

    @Override
    public String toString() {
        return "Socios{" + "documento=" + documento + ", nombre=" + nombre + ", tipoCuota=" + tipoCuota + ", cantidadAdicionales=" + cantidadAdicionales + ", tipo de cuota: " + this.tipoDeCuota()+'}';
    }
}
