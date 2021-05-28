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
public class DatoFast {
    
    private String apiToken;
    private String identificacion;

    public DatoFast(String apiToken, String identificacion) {
        this.apiToken = apiToken;
        this.identificacion = identificacion;
    }

    
    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "DataFast{" + "apiToken=" + apiToken + ", identificacion=" + identificacion + '}';
    }

    
}
