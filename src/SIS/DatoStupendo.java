/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIS;

import SIS.Clases.Estupendo;
import SIS.logica.Conexion;
import SIS.logica.SolicitudDao;

/**
 * Programa para transaccionar con el servicio de Stupendo
 * @since 28/04/2020
 * @author eyanchatipan
 */
public class DatoStupendo {

    
    public static void main(String[] args) {
        
        int figura=0;
        if(args[1].equals("C")) //Para datos de clientes
        {
            //Determinar si la identificacion tiene 10 digitos para enviar figura para naturales
            if(args[0].trim().length()==10)
                figura=1;
            else if(args[0].trim().length()>10 && args[0].trim().endsWith("001")) //Mas de 10 y con finalizacion 001 Juridicas
                figura=3;
        }
        else if(args[1].trim().equals("V")) //Para Datos de vehículos
        {            
            figura=2;
        }
        
        //Verifica los datos de las tablas intermedias en el caso que necesiten actualizacion
        try 
        {            
            //Conectando a base
            System.out.println("Conectando a base de datos...");
            if(args[2].trim().equals("D"))
            {
                System.out.println("Base: DESARROLLO");
                Conexion.setUrlConexion("jdbc:informix-sqli://192.168.105.11:1528/seguros:INFORMIXSERVER=ol_telco");
                //Conexion.setUrlConexion("jdbc:informix-sqli://186.5.109.203:1528/seguros:INFORMIXSERVER=ol_serverdev");
            }
            else if(args[2].trim().equals("P"))
            {
                System.out.println("Base: PRODUCCION");
                Conexion.setUrlConexion("jdbc:informix-sqli://192.168.20.60:1526/seguros:INFORMIXSERVER=ol_server");
            }
            
            Conexion.setDriver("com.informix.jdbc.IfxDriver");
            Conexion.PrepararBase();
            
           System.out.println("Verificando actualizacion de datos....");
           String actualizado=new SolicitudDao().verificarDataStupendo(args[0], figura);
           
           if(actualizado.equals("D"))
           {
               System.out.println("Consultando a Stupendo...");
               Estupendo stupendo=new Estupendo(args[0].trim(), figura);
               stupendo.registraDatos();
               System.out.println("Consultando a Stupendo...OK");
           }
           else
               System.out.println("***DATOS ACTUALES***");
        } 
        catch (Exception e) 
        {
            System.err.println("ERROR: "+e.toString());
        }
        
        
    }
    
    
    
}
