/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIS.entidad;

/**
 * Clase entidad de respuesta de stupendo
 * @author eyanchatipan
 */
public class RespuestaSolicitud {
    
   private boolean resultado;
   private String Mensaje;
   private String id_cliente;
   private String id_solicitud;
   private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
   
    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(String id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    
}
