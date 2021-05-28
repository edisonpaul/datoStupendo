/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIS.Clases;

import SIS.Utilidades.ManagerProperties;
import SIS.Utilidades.Utilidades;
import SIS.entidad.DatoFast;
import SIS.entidad.Persona;
import SIS.entidad.RespuestaDatoFastPJ;
import SIS.entidad.RespuestaDatoFastPN;
import SIS.entidad.RespuestaDatoFastVH;
import SIS.entidad.Solicitud;
import SIS.entidad.Vehiculo;
import SIS.logica.SolicitudDao;
import SIS.servicios.StupendoServicio;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase 
 * @author eyanchatipan
 */
public class Estupendo 
{
    Solicitud solicitud=null;    
    SolicitudDao dao=new SolicitudDao();
    ManagerProperties properties=new ManagerProperties();

    public Estupendo(String identificacion, int figura) {
        solicitud=new Solicitud();
        solicitud.setIdentificacion(identificacion);
        solicitud.setFigura(figura);
    }
    
    public void registraInfoDatoFast(){
        
        try{
             StupendoServicio servicio= new  StupendoServicio();
             String output="";
             DatoFast dato=new DatoFast(properties.getPropValues("apiTokenStupendo"), solicitud.getIdentificacion());
             String  parametro=servicio.getFormatoJson(dato);
             System.out.println(parametro);
             try{
                 
                 System.out.println("Figura: "+solicitud.getFigura());
                 
                 switch(solicitud.getFigura())
                 {
                     case 1:
                         output=servicio.conectaStupendo(properties.getPropValues("direccionStupendoPN"),parametro);
                         System.out.println(output.toLowerCase());
                         if(!output.contains("Empty reply from server")){
                             RespuestaDatoFastPN respuestaPN=servicio.getRespuestaStupendoPN(output);
                             if(respuestaPN.isResult()){
                                 if(respuestaPN.getDatos().getPersona()!=null){
                                     if(!respuestaPN.getDatos().getPersona().getCedula().isEmpty()){
                                         dao.registraPersona(respuestaPN.getDatos().getPersona());
                                     }
                                 }
                                 if(respuestaPN.getDatos().getConyuge()!=null){
                                     if(!respuestaPN.getDatos().getConyuge().getCedula().isEmpty()){
                                         dao.registraPersona(respuestaPN.getDatos().getConyuge());
                                     }
                                 }
                                 if(respuestaPN.getDatos().getRucPersonal()!=null){
                                     if(!respuestaPN.getDatos().getRucPersonal().getRuc().isEmpty()){
                                         dao.registraEmpresa(respuestaPN.getDatos().getRucPersonal());
                                     }
                                 }
                                 if(respuestaPN.getDatos().getEmpresa()!=null){
                                     if(!respuestaPN.getDatos().getEmpresa().getRuc().isEmpty()){
                                         dao.registraEmpresa(respuestaPN.getDatos().getEmpresa());
                                     }
                                 }
                             }else{
                                 System.out.println("***Error al recuperar informacion datofast num_identificacion: "+
                                         solicitud.getIdentificacion()+" "+respuestaPN.getError());
                             }                            

                         }
                         break;
                     case 2:
                         output=servicio.conectaStupendo(properties.getPropValues("direccionStupendoVH"),parametro);
                            System.out.println(output.toLowerCase());
                            if(!output.contains("Empty reply from server")){
                                RespuestaDatoFastVH respuestaVh=servicio.getRespuestaStupendoVH(output);
                                if(respuestaVh.isResult()){
                                    if(respuestaVh.getDatos()!=null){
                                        dao.registraVehiculo(respuestaVh.getDatos());
                                    }
                                }else{
                                    System.out.println("***Error al recuperar informacion datofast num_identificacion: "+
                                       solicitud.getIdentificacion()+" "+respuestaVh.getError());
                                }
                            }
                            break;
                     case 3:
                         output=servicio.conectaStupendo(properties.getPropValues("direccionStupendoPJ"),parametro);
                         System.out.println(output.toLowerCase());
                         if(!output.contains("Empty reply from server")){
                             RespuestaDatoFastPJ respuestaPJ=servicio.getRespuestaStupendoPJ(output);
                             if(respuestaPJ.isResult()){
                                 if(respuestaPJ.getDatos()!=null){
                                     if(!respuestaPJ.getDatos().getRuc().isEmpty()){
                                         dao.registraEmpresa(respuestaPJ.getDatos());
                                     }
                                 }
                             }else{
                                 System.out.println("***Error al recuperar informacion datofast num_identificacion: "+
                                         solicitud.getIdentificacion()+" "+respuestaPJ.getError());
                             }
                         }
                         break;
                     default:
                         break;
                 }
             } catch (JsonProcessingException ex) {
                 Logger.getLogger(Estupendo.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException | SQLException ex) {
                 Logger.getLogger(Estupendo.class.getName()).log(Level.SEVERE, null, ex);
             }
         } catch (JsonProcessingException ex) {
            Logger.getLogger(Estupendo.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public void registraDatos() throws Exception
    {
        try
        {     
            System.out.println("Figura: "+solicitud.getFigura());
            String output="";
                 
            switch(solicitud.getFigura())
            {
                case 1: Persona cliente=new Utilidades().getDatosPersonaPorIdentificacion(solicitud.getIdentificacion());  
//                        if(cliente!=null)
//                        {
//                            if(cliente.getCedula()!=null)
//                            {
//                                dao.registraPersona(cliente);
//                            }
//                        }
//                        else
//                        {
//                            System.out.println("***Error al recuperar informacion num_identificacion: "+
//                                         solicitud.getIdentificacion());
//                        }   
                break;
                
                case 2: Vehiculo vh=new Utilidades().getDatosVhPorPlaca(solicitud.getIdentificacion());  
//                        if(vh!=null)
//                        {
//                            if(vh.getPlaca()!=null)
//                            {
//                                dao.registraVehiculo(vh);
//                            }
//                        }
//                        else
//                        {
//                            System.out.println("***Error al recuperar informacion placa: "+
//                                         solicitud.getIdentificacion());
//                        }   
                break;
            }
             
            
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
}
