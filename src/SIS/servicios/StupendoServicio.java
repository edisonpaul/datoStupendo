/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIS.servicios;

import SIS.entidad.RespuestaDatoFastPJ;
import SIS.entidad.RespuestaDatoFastPN;
import SIS.entidad.RespuestaDatoFastVH;
import SIS.entidad.RespuestaSolicitud;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author eyanchatipan
 */
public class StupendoServicio {
    
    public StupendoServicio() {
    
    }
    
    public RespuestaSolicitud getRespuestaStupendo(String jsonString) throws IOException{
    RespuestaSolicitud respuesta= new ObjectMapper().readValue(jsonString, RespuestaSolicitud.class);
    return respuesta;
   }
    
   public RespuestaDatoFastPN getRespuestaStupendoPN(String jsonString) throws IOException{
    RespuestaDatoFastPN respuesta= new ObjectMapper().readValue(jsonString, RespuestaDatoFastPN.class);
    return respuesta;
   } 
   
   public RespuestaDatoFastPJ getRespuestaStupendoPJ(String jsonString) throws IOException{
    RespuestaDatoFastPJ respuesta= new ObjectMapper().readValue(jsonString, RespuestaDatoFastPJ.class);
    return respuesta;
   }  
   
   public RespuestaDatoFastVH getRespuestaStupendoVH(String jsonString) throws IOException{
    RespuestaDatoFastVH respuesta= new ObjectMapper().readValue(jsonString, RespuestaDatoFastVH.class);
    return respuesta;
   } 
    
   public String getFormatoJson(Object object) throws JsonProcessingException{
       ObjectMapper mapper = new ObjectMapper();
       return mapper.writeValueAsString(object);
    }
   
   public String conectaStupendo(String direccionStupendo, String parametro) throws MalformedURLException, IOException{
       URL url = new URL(direccionStupendo);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("Content-Type","application/json ; charset=UTF-8");
            con.setRequestMethod("POST");
            con.setDoOutput(true);
            con.getOutputStream().write(parametro.getBytes("UTF-8"));
            InputStream in =new BufferedInputStream(con.getInputStream());
            String resultado=IOUtils.toString(in,"UTF-8");
            
            return resultado;
   }
}

