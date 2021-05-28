/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIS.logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author eyanchatipan
 */
public class Conexion {
    
    static File archivo=null;
    static FileReader archivoLeido=null;
    static BufferedReader bufferLeido = null;
    static String urlConexion;
    static String driver;
    static Connection conexion;

    public static File getArchivo() {
        return archivo;
    }

    public static void setArchivo(File archivo) {
        Conexion.archivo = archivo;
    }

    public static FileReader getArchivoLeido() {
        return archivoLeido;
    }

    public static void setArchivoLeido(FileReader archivoLeido) {
        Conexion.archivoLeido = archivoLeido;
    }

    public static BufferedReader getBufferLeido() {
        return bufferLeido;
    }

    public static void setBufferLeido(BufferedReader bufferLeido) {
        Conexion.bufferLeido = bufferLeido;
    }

    public static String getUrlConexion() {
        return urlConexion;
    }

    public static void setUrlConexion(String urlConexion) {
        Conexion.urlConexion = urlConexion;
    }

    public static String getDriver() {
        return driver;
    }

    public static void setDriver(String driver) {
        Conexion.driver = driver;
    }

    public static Connection getConexion() {
        return conexion;
    }

    public static void setConexion(Connection conexion) {
        Conexion.conexion = conexion;
    }
        
    
    public static String LeerArchivo(String Ruta, String Base) throws Exception
    {
        String linea=null;
        String url=null;

        try
        {

             archivo = new File (Ruta+"ConfiguracionInicial.txt");
             archivoLeido = new FileReader (archivo);
             bufferLeido = new BufferedReader(archivoLeido);


             while((linea=bufferLeido.readLine())!=null)
             {                 
                 if(linea.toLowerCase().contains(Base.toLowerCase()))
                 {
                    url=linea;                
                    break;
                 }
             }

             //Obtener el url neto
             url=url.replace(Base.toLowerCase()+":", "").trim();
             
             urlConexion=url;
             
             url="";
             
                          
             archivoLeido = new FileReader (archivo);
             bufferLeido = new BufferedReader(archivoLeido);
             
             //Determinar Driver
             while((linea=bufferLeido.readLine())!=null)
             {                 
                 if(linea.toLowerCase().contains("driver"))
                 {
                    url=linea;                
                    break;
                 }
             }

             //Obtener el url neto
             driver=url.replace("Driver:", "").trim();
        }
        catch(Exception e)
        {
            throw e;
        }

        return url;
    }
    
    public static void PrepararBase() throws Exception
    {
        try
        {
            String controlador=driver;
            Class.forName(controlador).newInstance();                     
            String DSN=urlConexion+";user=sis;password=ZweAd3n.2018";    
            //String DSN=urlConexion+";user=informix;password=Replixas1";    
            conexion=DriverManager.getConnection(DSN);
                                              
        }
        catch(Exception e)
        {
            throw e;            
        }

        
    }
    
}
