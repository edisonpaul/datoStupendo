/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIS.Utilidades;

import SIS.entidad.Persona;
import SIS.entidad.Vehiculo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.binary.Base64;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/**
 *
 * @author contabilidad04
 */
public class Utilidades 
{
    ManagerProperties properties=new ManagerProperties();
    
    public static java.sql.Date getDate(String date) {
        if (date.isEmpty()) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date parsed = null;
        try {
            parsed = new java.sql.Date(sdf.parse(date).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        }

        return parsed;
    }
    
    /**
    *
    * @author eyanchatipan
    * Metodo que obtiene la respuesta del servicio web consumido
     * @param url: direccion del servicio web
     * @param params: mapa de parametros que se envia al servicio web
     * @return 
    */
    public String getRespuestaServicioWeb(String urlWs,  Map<String, Object> params) throws Exception{
        
        StringBuilder resultado = new StringBuilder();
        
        try 
        {
            //Generar los parametros
            String parString="";
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                parString+=entry.getValue().toString()+"/";
            }
            
            URL url = new URL(urlWs+parString);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", getAuthorization());
            con.setDoInput(true);            
            con.connect();
            // Búferes para leer
            BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
            String linea;
            // Mientras el BufferedReader se pueda leer, agregar contenido a resultado
            while ((linea = rd.readLine()) != null) {
                resultado.append(linea);
            }
            // Cerrar el BufferedReader
            rd.close();
            con.disconnect();


            System.out.println(resultado);
        } 
        catch (Exception e) 
        {
            throw e;
        }
        
            

        return resultado.toString();
    }
    
    private String getAuthorization(){
        String auth = properties.getPropValues("usuarioSWInfo") + ":" + 
                      properties.getPropValues("claveSWInfo");
        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
        String authHeader = "Basic " + new String(encodedAuth);
        
        return authHeader;
    }
    
    public Persona getDatosPersonaPorIdentificacion(String identificacion)
    {
        Persona objeto=null;
        //Consultar datos del cliente ingresado al servicio Core
        Map<String, Object> args = new HashMap<>();
        args.put("identificacion", identificacion);

        List<Persona> getDatos=null;
        try 
        {
            String json=new Utilidades().getRespuestaServicioWeb(properties.getPropValues("direccionMineria")+"utilidadesService/getInfoPorIdentificacion/", args); 

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT-5"));
            ObjectMapper mapper = new ObjectMapper();
            mapper.getDeserializationConfig().setDateFormat(dateFormat);
            mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            getDatos = mapper.readValue(json, new TypeReference<List<Persona>>(){});
            
            if(getDatos!=null && !getDatos.isEmpty())
            {
                objeto=getDatos.get(0);
            }

        } 
        catch (Exception e) 
        {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, 
                    "GENERAL: Error al Consultar Identificacion Web Service  Identificacion: "
                    + identificacion, e);
        }
            
        return objeto;
        
    }
    
    public Vehiculo getDatosVhPorPlaca(String placa)
    {
        Vehiculo objeto=null;
        //Consultar datos del cliente ingresado al servicio Core
        Map<String, Object> args = new HashMap<>();
        args.put("placa", placa);

        List<Vehiculo> getDatos=null;
        try 
        {
            String json=new Utilidades().getRespuestaServicioWeb(properties.getPropValues("direccionMineria")+"utilidadesService/getInfoPorPlaca/", args); 

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT-5"));
            ObjectMapper mapper = new ObjectMapper();
            mapper.getDeserializationConfig().setDateFormat(dateFormat);
            mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            getDatos = mapper.readValue(json, new TypeReference<List<Vehiculo>>(){});
            
            if(getDatos!=null && !getDatos.isEmpty())
            {
                objeto=getDatos.get(0);
            }

        } 
        catch (Exception e) 
        {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, 
                    "GENERAL: Error al Consultar Vehiculo Web Service  Placa: "
                    + placa, e);
        }
            
        return objeto;
        
    }
    
}
