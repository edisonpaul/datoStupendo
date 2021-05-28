/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIS.Utilidades;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author contabilidad04
 */
public class ManagerProperties {
    
     /**
     *
     * @author dguerra
     * Permite obtener el valor del archivo properties 
     * @param key clave mediante la cual busca un valor predeterminado 
     * @return valor del properties buscado
     */ 
    public String getPropValues(String key){
         Properties prop = new Properties();
         String propFile = "SIS/Utilidades/config.properties";
         InputStream input = getClass().getClassLoader().getResourceAsStream(propFile);
         if (input != null) {
             try {
                 prop.load(input);
             } catch (IOException ex) {
                 Logger.getLogger(ManagerProperties.class.getName()).log(Level.SEVERE, null, ex);
             }
                return prop.getProperty(key);
       		
     }
         return "";
     }
    
}
