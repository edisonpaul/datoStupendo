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
public class Persona 
{    
    private String nombre  ; private String  email  ; 
    private String  conyuge  ;
    private String nombres_conyuge  ; private String  ruc_trabajo  ; private String  cargo_trabajo;  
    private String empresa_trabajo  ; private String placa_vehiculo  ; private String marca_vehiculo  ; 
    private String  modelo_vehiculo  ; private String anio_vehiculo  ; private String  color_vehiculo  ;
    private String clase_vehiculo  ; private String  tipo_vehiculo  ; private String motor_vehiculo  ; 
    private String  chasis_vehiculo  ; private String  apellido1  ; private String apellido2  ; 
    private String nombre1  ; private String  nombre2  ; private String  fecha_nacimiento  ; private String  fecha_ingreso_trabajo  ; 
    private String   cedula  ; private String genero  ; private String  direcciones  ; 
    private String  telefonos  ; private String celulares; private String estado_civil  ; 
    private String  lugar_nacimiento  ; private String codigo_lugar_nacimiento  ;
    private String   nacionalidad  ; private String   codigo_nacionalidad  ;
    private String  instruccion  ; private String  codigo_instruccion  ;private String   profesion  ; private String  codigo_profesion  ; 
    private String   condicion_ciudadano  ; private String  codigo_condicion_ciudadano  ; private String  ubicacion_domicilio  ; 
    private String  codigo_ubicacion_domicilio  ;private String  rango_ingresos_trabajo  ; private String  codigo_rango_ingresos_trabajo  ; 
    private String provincia  ; private String  canton  ; private String  parroquia  ; private String  primer_nombre  ; 
    private String  segundo_nombre  ; private String  primer_apellido  ; private String  segundo_apellido  ; 
    private String codigo_estado_civil; private String direccion_trabajo; private String direccion_domicilio;
    private String telefono_domicilio; private String telefono_celular;
   private String direccion_empresa; private String tel_empresa;

    public String getDireccion_empresa() {
        return direccion_empresa;
    }

    public void setDireccion_empresa(String direccion_empresa) {
        this.direccion_empresa = direccion_empresa;
    }

    public String getTel_empresa() {
        return tel_empresa;
    }

    public void setTel_empresa(String tel_empresa) {
        this.tel_empresa = tel_empresa;
    }

   
   
      public String getTelefono_domicilio() {
          return telefono_domicilio;
      }

      public void setTelefono_domicilio(String telefono_domicilio) {
          this.telefono_domicilio = telefono_domicilio;
      }

      public String getTelefono_celular() {
          return telefono_celular;
      }

      public void setTelefono_celular(String telefono_celular) {
          this.telefono_celular = telefono_celular;
      }

      public String getDireccion_domicilio() {
          return direccion_domicilio;
      }

      public void setDireccion_domicilio(String direccion_domicilio) {
          this.direccion_domicilio = direccion_domicilio;
      }

      public String getDireccion_trabajo() {
          return direccion_trabajo;
      }

      public void setDireccion_trabajo(String direccion_trabajo) {
          this.direccion_trabajo = direccion_trabajo;
      }

      public String getCodigo_estado_civil() {
          return codigo_estado_civil;
      }

      public void setCodigo_estado_civil(String codigo_estado_civil) {
          this.codigo_estado_civil = codigo_estado_civil;
      }

      public String getCelulares() {
          return celulares;
      }

        public String getNombre() {
          return nombre;
      }

      public void setNombre(String nombre) {
          this.nombre = nombre;
      }

      public String getEmail() {
          return email;
      }

      public void setEmail(String email) {
          this.email = email;
      }

      public String getNombres_conyuge() {
          return nombres_conyuge;
      }

      public void setNombres_conyuge(String nombres_conyuge) {
          this.nombres_conyuge = nombres_conyuge;
      }

      public String getRuc_trabajo() {
          return ruc_trabajo;
      }

      public void setRuc_trabajo(String ruc_trabajo) {
          this.ruc_trabajo = ruc_trabajo;
      }

      public String getCargo_trabajo() {
          return cargo_trabajo;
      }

      public void setCargo_trabajo(String cargo_trabajo) {
          this.cargo_trabajo = cargo_trabajo;
      }

      public String getEmpresa_trabajo() {
          return empresa_trabajo;
      }

      public void setEmpresa_trabajo(String empresa_trabajo) {
          this.empresa_trabajo = empresa_trabajo;
      }

      public String getPlaca_vehiculo() {
          return placa_vehiculo;
      }

      public void setPlaca_vehiculo(String placa_vehiculo) {
          this.placa_vehiculo = placa_vehiculo;
      }

      public String getMarca_vehiculo() {
          return marca_vehiculo;
      }

      public void setMarca_vehiculo(String marca_vehiculo) {
          this.marca_vehiculo = marca_vehiculo;
      }

      public String getModelo_vehiculo() {
          return modelo_vehiculo;
      }

      public void setModelo_vehiculo(String modelo_vehiculo) {
          this.modelo_vehiculo = modelo_vehiculo;
      }

      public String getAnio_vehiculo() {
          return anio_vehiculo;
      }

      public void setAnio_vehiculo(String anio_vehiculo) {
          this.anio_vehiculo = anio_vehiculo;
      }

      public String getColor_vehiculo() {
          return color_vehiculo;
      }

      public void setColor_vehiculo(String color_vehiculo) {
          this.color_vehiculo = color_vehiculo;
      }

      public String getClase_vehiculo() {
          return clase_vehiculo;
      }

      public void setClase_vehiculo(String clase_vehiculo) {
          this.clase_vehiculo = clase_vehiculo;
      }

      public String getTipo_vehiculo() {
          return tipo_vehiculo;
      }

      public void setTipo_vehiculo(String tipo_vehiculo) {
          this.tipo_vehiculo = tipo_vehiculo;
      }

      public String getMotor_vehiculo() {
          return motor_vehiculo;
      }

      public void setMotor_vehiculo(String motor_vehiculo) {
          this.motor_vehiculo = motor_vehiculo;
      }

      public String getChasis_vehiculo() {
          return chasis_vehiculo;
      }

      public void setChasis_vehiculo(String chasis_vehiculo) {
          this.chasis_vehiculo = chasis_vehiculo;
      }

      public String getApellido1() {
          return apellido1;
      }

      public void setApellido1(String apellido1) {
          this.apellido1 = apellido1;
      }

      public String getApellido2() {
          return apellido2;
      }

      public void setApellido2(String apellido2) {
          this.apellido2 = apellido2;
      }

      public String getNombre1() {
          return nombre1;
      }

      public void setNombre1(String nombre1) {
          this.nombre1 = nombre1;
      }

      public String getNombre2() {
          return nombre2;
      }

      public void setNombre2(String nombre2) {
          this.nombre2 = nombre2;
      }

      public String getFecha_nacimiento() {
          return fecha_nacimiento;
      }

      public void setFecha_nacimiento(String fecha_nacimiento) {
          this.fecha_nacimiento = fecha_nacimiento;
      }

      public String getFecha_ingreso_trabajo() {
          return fecha_ingreso_trabajo;
      }

      public void setFecha_ingreso_trabajo(String fecha_ingreso_trabajo) {
          this.fecha_ingreso_trabajo = fecha_ingreso_trabajo;
      }

      public String getCedula() {
          return cedula;
      }

      public void setCedula(String cedula) {
          this.cedula = cedula;
      }

      public String getGenero() {
          return genero;
      }

      public void setGenero(String genero) {
          this.genero = genero;
      }

      public String getDirecciones() {
          return direcciones;
      }

      public void setDirecciones(String direcciones) {
          this.direcciones = direcciones;
      }

      public String getTelefonos() {
          return telefonos;
      }

      public void setTelefonos(String telefonos) {
          this.telefonos = telefonos;
      }

      public String getEstado_civil() {
          return estado_civil;
      }

      public void setEstado_civil(String estado_civil) {
          this.estado_civil = estado_civil;
      }

      public String getLugar_nacimiento() {
          return lugar_nacimiento;
      }

      public void setLugar_nacimiento(String lugar_nacimiento) {
          this.lugar_nacimiento = lugar_nacimiento;
      }

      public String getCodigo_lugar_nacimiento() {
          return codigo_lugar_nacimiento;
      }

      public void setCodigo_lugar_nacimiento(String codigo_lugar_nacimiento) {
          this.codigo_lugar_nacimiento = codigo_lugar_nacimiento;
      }

      public String getNacionalidad() {
          return nacionalidad;
      }

      public void setNacionalidad(String nacionalidad) {
          this.nacionalidad = nacionalidad;
      }

      public String getCodigo_nacionalidad() {
          return codigo_nacionalidad;
      }

      public void setCodigo_nacionalidad(String codigo_nacionalidad) {
          this.codigo_nacionalidad = codigo_nacionalidad;
      }

      public String getInstruccion() {
          return instruccion;
      }

      public void setInstruccion(String instruccion) {
          this.instruccion = instruccion;
      }

      public String getCodigo_instruccion() {
          return codigo_instruccion;
      }

      public void setCodigo_instruccion(String codigo_instruccion) {
          this.codigo_instruccion = codigo_instruccion;
      }

      public String getProfesion() {
          return profesion;
      }

      public void setProfesion(String profesion) {
          this.profesion = profesion;
      }

      public String getCodigo_profesion() {
          return codigo_profesion;
      }

      public void setCodigo_profesion(String codigo_profesion) {
          this.codigo_profesion = codigo_profesion;
      }

      public String getCondicion_ciudadano() {
          return condicion_ciudadano;
      }

      public void setCondicion_ciudadano(String condicion_ciudadano) {
          this.condicion_ciudadano = condicion_ciudadano;
      }

      public String getCodigo_condicion_ciudadano() {
          return codigo_condicion_ciudadano;
      }

      public void setCodigo_condicion_ciudadano(String codigo_condicion_ciudadano) {
          this.codigo_condicion_ciudadano = codigo_condicion_ciudadano;
      }

      public String getUbicacion_domicilio() {
          return ubicacion_domicilio;
      }

      public void setUbicacion_domicilio(String ubicacion_domicilio) {
          this.ubicacion_domicilio = ubicacion_domicilio;
      }

      public String getCodigo_ubicacion_domicilio() {
          return codigo_ubicacion_domicilio;
      }

      public void setCodigo_ubicacion_domicilio(String codigo_ubicacion_domicilio) {
          this.codigo_ubicacion_domicilio = codigo_ubicacion_domicilio;
      }

      public String getRango_ingresos_trabajo() {
          return rango_ingresos_trabajo;
      }

      public void setRango_ingresos_trabajo(String rango_ingresos_trabajo) {
          this.rango_ingresos_trabajo = rango_ingresos_trabajo;
      }

      public String getCodigo_rango_ingresos_trabajo() {
          return codigo_rango_ingresos_trabajo;
      }

      public void setCodigo_rango_ingresos_trabajo(String codigo_rango_ingresos_trabajo) {
          this.codigo_rango_ingresos_trabajo = codigo_rango_ingresos_trabajo;
      }

      public String getProvincia() {
          return provincia;
      }

      public void setProvincia(String provincia) {
          this.provincia = provincia;
      }

      public String getCanton() {
          return canton;
      }

      public void setCanton(String canton) {
          this.canton = canton;
      }

      public String getParroquia() {
          return parroquia;
      }

      public void setParroquia(String parroquia) {
          this.parroquia = parroquia;
      }

      public String getPrimer_nombre() {
          return primer_nombre;
      }

      public void setPrimer_nombre(String primer_nombre) {
          this.primer_nombre = primer_nombre;
      }

      public String getSegundo_nombre() {
          return segundo_nombre;
      }

      public void setSegundo_nombre(String segundo_nombre) {
          this.segundo_nombre = segundo_nombre;
      }

      public String getPrimer_apellido() {
          return primer_apellido;
      }

      public void setPrimer_apellido(String primer_apellido) {
          this.primer_apellido = primer_apellido;
      }

      public String getSegundo_apellido() {
          return segundo_apellido;
      }

      public void setSegundo_apellido(String segundo_apellido) {
          this.segundo_apellido = segundo_apellido;
      }

      public String getConyuge() {
          return conyuge;
      }

      public void setConyuge(String conyuge) {
          this.conyuge = conyuge;
      }

      @Override
      public String toString() {
          return "Persona{" + "nombre=" + nombre + ", email=" + email + ", conyuge=" + conyuge + ", nombres_conyuge=" + nombres_conyuge + ", ruc_trabajo=" + ruc_trabajo + ", cargo_trabajo=" + cargo_trabajo + ", empresa_trabajo=" + empresa_trabajo + ", placa_vehiculo=" + placa_vehiculo + ", marca_vehiculo=" + marca_vehiculo + ", modelo_vehiculo=" + modelo_vehiculo + ", anio_vehiculo=" + anio_vehiculo + ", color_vehiculo=" + color_vehiculo + ", clase_vehiculo=" + clase_vehiculo + ", tipo_vehiculo=" + tipo_vehiculo + ", motor_vehiculo=" + motor_vehiculo + ", chasis_vehiculo=" + chasis_vehiculo + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", fecha_nacimiento=" + fecha_nacimiento + ", fecha_ingreso_trabajo=" + fecha_ingreso_trabajo + ", cedula=" + cedula + ", genero=" + genero + ", direcciones=" + direcciones + ", telefonos=" + telefonos + ", estado_civil=" + estado_civil + ", lugar_nacimiento=" + lugar_nacimiento + ", codigo_lugar_nacimiento=" + codigo_lugar_nacimiento + ", nacionalidad=" + nacionalidad + ", codigo_nacionalidad=" + codigo_nacionalidad + ", instruccion=" + instruccion + ", codigo_instruccion=" + codigo_instruccion + ", profesion=" + profesion + ", codigo_profesion=" + codigo_profesion + ", condicion_ciudadano=" + condicion_ciudadano + ", codigo_condicion_ciudadano=" + codigo_condicion_ciudadano + ", ubicacion_domicilio=" + ubicacion_domicilio + ", codigo_ubicacion_domicilio=" + codigo_ubicacion_domicilio + ", rango_ingresos_trabajo=" + rango_ingresos_trabajo + ", codigo_rango_ingresos_trabajo=" + codigo_rango_ingresos_trabajo + ", provincia=" + provincia + ", canton=" + canton + ", parroquia=" + parroquia + ", primer_nombre=" + primer_nombre + ", segundo_nombre=" + segundo_nombre + ", primer_apellido=" + primer_apellido + ", segundo_apellido=" + segundo_apellido + '}';
      }

    
}
