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
public class RespuestaDatoFastPN {
    
    private boolean result;
    private DatosPN datos;
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    
    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    

    public DatosPN getDatos() {
        return datos;
    }

    public void setDatos(DatosPN datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "RespuestaDatoFastPN{" + "result=" + result + ", datos=" + datos + ", error=" + error + '}';
    }

    
}
