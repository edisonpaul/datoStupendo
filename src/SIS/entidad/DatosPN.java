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
public class DatosPN {
    
    private Persona persona;
      private Empresa rucPersonal;
      private Persona conyuge;
      private Empresa empresa;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Empresa getRucPersonal() {
        return rucPersonal;
    }

    public void setRucPersonal(Empresa rucPersonal) {
        this.rucPersonal = rucPersonal;
    }

    public Persona getConyuge() {
        return conyuge;
    }

    public void setConyuge(Persona conyuge) {
        this.conyuge = conyuge;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "DatosPN{" + "persona=" + persona + ", rucPersonal=" + rucPersonal + ", conyuge=" + conyuge + ", empresa=" + empresa + '}';
    }

    
}
