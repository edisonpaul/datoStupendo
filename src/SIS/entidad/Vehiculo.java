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
public class Vehiculo {
    
    private String placa;
    private String marca;
    private String modelo;
    private String anio;
    private String clase;
    private String subclase;
    private String tipo;
    private String motor;
    private String chasis;
    private String cedula_propietario;
    private String nombre_propietario;
    private String pais;
    private String capacidad;
    private String cilindraje;
    private String combustible;
    private String estado_exoneracion;
    private String fecha_compra;
    private String fecha_caducidad;
    private String camv;
    private String carga_util;
    private String anio_fiscal;
    private String valor_avaluo;
    private String valor_impuesto;
    private String precio_venta;
    private String canton_matriculacion;
    private String color;
    private String fecha_nacimiento_propietario;
    private String estado_civil_propietario;
    private String genero_propietario;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getSubclase() {
        return subclase;
    }

    public void setSubclase(String subclase) {
        this.subclase = subclase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getCedula_propietario() {
        return cedula_propietario;
    }

    public void setCedula_propietario(String cedula_propietario) {
        this.cedula_propietario = cedula_propietario;
    }

    public String getNombre_propietario() {
        return nombre_propietario;
    }

    public void setNombre_propietario(String nombre_propietario) {
        this.nombre_propietario = nombre_propietario;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getEstado_exoneracion() {
        return estado_exoneracion;
    }

    public void setEstado_exoneracion(String estado_exoneracion) {
        this.estado_exoneracion = estado_exoneracion;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public String getCamv() {
        return camv;
    }

    public void setCamv(String camv) {
        this.camv = camv;
    }

    public String getCarga_util() {
        return carga_util;
    }

    public void setCarga_util(String carga_util) {
        this.carga_util = carga_util;
    }

    public String getAnio_fiscal() {
        return anio_fiscal;
    }

    public void setAnio_fiscal(String anio_fiscal) {
        this.anio_fiscal = anio_fiscal;
    }

    public String getValor_avaluo() {
        return valor_avaluo;
    }

    public void setValor_avaluo(String valor_avaluo) {
        this.valor_avaluo = valor_avaluo;
    }

    public String getValor_impuesto() {
        return valor_impuesto;
    }

    public void setValor_impuesto(String valor_impuesto) {
        this.valor_impuesto = valor_impuesto;
    }

    public String getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(String precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getCanton_matriculacion() {
        return canton_matriculacion;
    }

    public void setCanton_matriculacion(String canton_matriculacion) {
        this.canton_matriculacion = canton_matriculacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFecha_nacimiento_propietario() {
        return fecha_nacimiento_propietario;
    }

    public void setFecha_nacimiento_propietario(String fecha_nacimiento_propietario) {
        this.fecha_nacimiento_propietario = fecha_nacimiento_propietario;
    }

    public String getEstado_civil_propietario() {
        return estado_civil_propietario;
    }

    public void setEstado_civil_propietario(String estado_civil_propietario) {
        this.estado_civil_propietario = estado_civil_propietario;
    }

    public String getGenero_propietario() {
        return genero_propietario;
    }

    public void setGenero_propietario(String genero_propietario) {
        this.genero_propietario = genero_propietario;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", clase=" + clase + ", subclase=" + subclase + ", tipo=" + tipo + ", motor=" + motor + ", chasis=" + chasis + ", cedula_propietario=" + cedula_propietario + ", nombre_propietario=" + nombre_propietario + ", pais=" + pais + ", capacidad=" + capacidad + ", cilindraje=" + cilindraje + ", combustible=" + combustible + ", estado_exoneracion=" + estado_exoneracion + ", fecha_compra=" + fecha_compra + ", fecha_caducidad=" + fecha_caducidad + ", camv=" + camv + ", carga_util=" + carga_util + ", anio_fiscal=" + anio_fiscal + ", valor_avaluo=" + valor_avaluo + ", valor_impuesto=" + valor_impuesto + ", precio_venta=" + precio_venta + ", canton_matriculacion=" + canton_matriculacion + ", color=" + color + ", fecha_nacimiento_propietario=" + fecha_nacimiento_propietario + ", estado_civil_propietario=" + estado_civil_propietario + ", genero_propietario=" + genero_propietario + '}';
    }

    
}
