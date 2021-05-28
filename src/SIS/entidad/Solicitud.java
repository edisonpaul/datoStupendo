/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIS.entidad;

/**
 *
 * @author eyanchatipan
 */
public class Solicitud {
    
    private int figura;
    private String tipo_identificacion;
    private String identificacion;
    private String email;
    private String razon_social;
    private String ruc_aseguradora;
    private String codigo_broker;
    private String MontoAsegurado;
    private String asegurado;

    public String getAsegurado() {
        return asegurado;
    }

    public void setAsegurado(String asegurado) {
        this.asegurado = asegurado;
    }
    
    public int getFigura() {
        return figura;
    }

    public void setFigura(int figura) {
        this.figura = figura;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getRuc_aseguradora() {
        return ruc_aseguradora;
    }

    public void setRuc_aseguradora(String ruc_aseguradora) {
        this.ruc_aseguradora = ruc_aseguradora;
    }

    public String getCodigo_broker() {
        return codigo_broker;
    }

    public void setCodigo_broker(String codigo_broker) {
        this.codigo_broker = codigo_broker;
    }

    public String getMontoAsegurado() {
        return MontoAsegurado;
    }

    public void setMontoAsegurado(String MontoAsegurado) {
        this.MontoAsegurado = MontoAsegurado;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "figura=" + figura + ", tipo_identificacion=" + tipo_identificacion + ", identificacion=" + identificacion + ", email=" + email + ", razon_social=" + razon_social + ", ruc_aseguradora=" + ruc_aseguradora + ", codigo_broker=" + codigo_broker + ", MontoAsegurado=" + MontoAsegurado + '}';
    }
    
}
