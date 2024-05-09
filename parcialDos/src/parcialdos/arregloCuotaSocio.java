/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdos;

import java.util.ArrayList;

/**
 *
 * @author Windows 10
 */
public class arregloCuotaSocio {
    ArrayList<Socio> socios;

    public arregloCuotaSocio() {
        
        socios = new ArrayList<Socio>();
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    
    
    public void agregarSocio(Socio s)
    {
       socios.add(s);            
        
    }
    
    public double facturacionTotalFull()
    {
        double total=0;
        int contador =0;
        for (Socio socio : socios) {
            if (socio.getCantidadAdicionales()>2 && socio.getTipoCuota()==3) {
                total+=2300 + (socio.getCantidadAdicionales()*500);
                contador++;
            }
            
        }
        return total;
    }     
    
        public double socioTotalFull()
    {
        double total=0;
        int contador =0;
        for (Socio socio : socios) {
            if (socio.getCantidadAdicionales()>2 && socio.getTipoCuota()==3) {
                contador++;
            }
            
        }
        return contador;
    }

     public double facturacionTotalBasica()
    {
        double total=0;
        int contador =0;
        for (Socio socio : socios) {
            if (socio.getTipoCuota()==1) {
                total+=1000 + socio.getCantidadAdicionales()*500;
                contador++;
            }
        }
        return total;
                
    }
            
          public double facturacionTotalMejorada()
    {
        double total=0;
        int contador =0;
        for (Socio socio : socios) {
            if (socio.getTipoCuota()==2) {
                total+=1500 + socio.getCantidadAdicionales()*500;
                contador++;
            }
        }
        return total;
                
    }
    
}
