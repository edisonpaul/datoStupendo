/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIS.entidad;

/**
 *
 * @author contabilidad04
 */
public class RespuestaDatoFastPJ {
    
    private boolean result;
    private Empresa datos;
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

    public Empresa getDatos() {
        return datos;
    }

    public void setDatos(Empresa datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "RespuestaDatoFastPJ{" + "result=" + result + ", datos=" + datos + ", error=" + error + '}';
    }

    
}
