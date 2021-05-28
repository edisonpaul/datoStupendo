/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIS.logica;

import SIS.Utilidades.Utilidades;
import SIS.entidad.Empresa;
import SIS.entidad.Persona;
import SIS.entidad.Solicitud;
import SIS.entidad.Vehiculo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author eyanchatipan
 */
public class SolicitudDao {
    
       
    public void registraPersona(Persona persona) throws SQLException {
    
        Connection cnConexion=Conexion.getConexion();
        try 
        {
            
            String sql="INSERT INTO sw_lavpersona "
                    + "(nombre, email, conyuge, nombres_conyuge, ruc_trabajo,"
                    + " cargo_trabajo, empresa_trabajo, placa_vehiculo, marca_vehiculo, modelo_vehiculo,"
                    + " anio_vehiculo, color_vehiculo, clase_vehiculo, tipo_vehiculo, motor_vehiculo,"
                    + " chasis_vehiculo, apellido1, apellido2, nombre1, nombre2, "
                    + " fecha_nacimiento, fecha_ingreso_trabajo, cedula, genero, direcciones,"
                    + " telefonos, estado_civil, lugar_nacimiento, codigo_lugar_nacimiento, nacionalidad,"
                    + " codigo_nacionalidad, instruccion, codigo_instruccion, profesion, codigo_profesion,"
                    + " condicion_ciudadano, codigo_condicion_ciudadano, ubicacion_domicilio, rango_ingresos_trabajo, codigo_rango_ingresos_trabajo,"
                    + " provincia, canton, parroqui, primer_nombre, segundo_nombre,"
                    + " primer_apellido, segundo_apellido, fecha_informacion, celulares, codigo_estado_civil) " +
                        "VALUES(?, ?, ?, ?, ?, "
                             + "?, ?, ?, ?, ?, "
                             + "?, ?, ?, ?, ?, "
                             + "?, ?, ?, ?, ?, "
                             + "?, ?, ?, ?, ?, "
                             + "?, ?, ?, ?, ?, "
                             + "?, ?, ?, ?, ?, "
                             + "?, ?, ?, ?, ?, "
                             + "?, ?, ?, ?, ?, "
                             + "?, ?, CURRENT YEAR TO SECOND,?,?)";
            
            PreparedStatement st = cnConexion.prepareStatement(sql);
            st.setString(1, persona.getNombre());
            st.setString(2, persona.getEmail());
            st.setString(3, persona.getConyuge());
            st.setString(4, persona.getNombres_conyuge());
            st.setString(5, persona.getRuc_trabajo());
            st.setString(6, persona.getCargo_trabajo());
            st.setString(7, persona.getEmpresa_trabajo());
            st.setString(8, persona.getPlaca_vehiculo());
            st.setString(9, persona.getMarca_vehiculo());
            st.setString(10, persona.getModelo_vehiculo());
            st.setString(11, persona.getAnio_vehiculo());
            st.setString(12, persona.getColor_vehiculo());
            st.setString(13, persona.getClase_vehiculo());
            st.setString(14, persona.getTipo_vehiculo());
            st.setString(15, persona.getMotor_vehiculo());
            st.setString(16, persona.getChasis_vehiculo());
            st.setString(17, persona.getApellido1());
            st.setString(18, persona.getApellido2());
            st.setString(19, persona.getNombre1());
            st.setString(20, persona.getNombre2());
            st.setDate(21, persona.getFecha_nacimiento()==null ? null :Utilidades.getDate(persona.getFecha_nacimiento().replace("\\", "")));
            st.setDate(22, persona.getFecha_ingreso_trabajo()==null ? null :Utilidades.getDate(persona.getFecha_ingreso_trabajo().replace("\\", "")));
            st.setString(23, persona.getCedula());
            st.setString(24, persona.getGenero());
            st.setString(25, persona.getDireccion_domicilio());
            st.setString(26, persona.getTelefono_domicilio()==null ? "" : persona.getTelefono_domicilio().replace("-", ""));
            st.setString(27, persona.getEstado_civil());
            st.setString(28, persona.getLugar_nacimiento());
            st.setString(29, persona.getCodigo_lugar_nacimiento());
            st.setString(30, persona.getNacionalidad());
            st.setString(31, persona.getCodigo_nacionalidad());
            st.setString(32, persona.getInstruccion());
            st.setString(33, persona.getCodigo_instruccion());
            st.setString(34, persona.getProfesion());
            st.setString(35, persona.getCodigo_profesion());
            st.setString(36, persona.getCondicion_ciudadano());
            st.setString(37, persona.getCodigo_condicion_ciudadano());
            st.setString(38, persona.getUbicacion_domicilio());
            st.setString(39, persona.getRango_ingresos_trabajo());
            st.setString(40, persona.getCodigo_rango_ingresos_trabajo());
            st.setString(41, persona.getProvincia());
            st.setString(42, persona.getCanton());
            st.setString(43, persona.getParroquia());
            st.setString(44, persona.getPrimer_nombre());
            st.setString(45, persona.getSegundo_nombre());
            st.setString(46, persona.getPrimer_apellido());
            st.setString(47, persona.getSegundo_apellido());
            st.setString(48, persona.getCelulares()==null ? "" : persona.getCelulares().replace("-", ""));
            st.setString(49, persona.getCodigo_estado_civil());
            
            st.executeUpdate();
           
        } catch (SQLException ex) {
            throw ex;
        }finally{
          //cnConexion.close();
        } 
    }
    
    public void registraEmpresa(Empresa empresa) throws SQLException {
    
        Connection cnConexion=Conexion.getConexion();
        try 
        {
            
            String sql="INSERT INTO sw_lavempresa "
                + "(razon_social, nombre_fantasia, valor_patrimonio, obligado_contabilidad, emails,"
                + " capital_suscrito, representante_legal, cargo_representante_legal, gerente_general, agente_retencion,"
                    + " ciudadela, barrio, carretero, numero, interseccion,"
                    + " manzana, supermanzana, conjunto, calle, nombre_edificio,"
                    + " numero_piso, numero_oficina, kilometro, camino, referencia,"
                    + " numero_establecimiento, tipo_empresa, numero_empleados, fecha_inscripcion, fecha_inicio,"
                    + " fecha_constitucion, fecha_nombramiento, ruc, personeria, estado_ruc,"
                    + " ubicacion, actividad, estado_establecimiento, telefonos, fecha_informacion,"
                    + " cedula_representante_legal, cedula_gerente_general, cargo_gerente_general, "
                    + " fecha_nombramiento_gerente_general, tipo_establecimiento, celulares, "
                    + " lista_blanca, tipo_contribuyente, requiere_accionista, beneficios_tributarios, "
                    + " direccion, codigo_ubicacion, codigo_actividad) " +
                "VALUES(?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, CURRENT YEAR TO SECOND,"
                    + " ?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?,"
                    + " ?, ?, ?) ";
            
            PreparedStatement st = cnConexion.prepareStatement(sql);
            
            st.setString(1, empresa.getRazon_social());
            st.setString(2, "");
            st.setDouble(3, empresa.getValor_patrimonio()!=null ? Double.parseDouble(empresa.getValor_patrimonio().replace(",", ".")): 0.0);
            st.setString(4, empresa.getObligado_contabilidad());
            st.setString(5, empresa.getEmails());
            st.setDouble(6, empresa.getCapital_suscrito()!=null ? Double.parseDouble(empresa.getCapital_suscrito().replace(",", ".")): 0.0);
            st.setString(7, empresa.getRepresentante_legal());
            st.setString(8, empresa.getCargo_representante_legal());
            st.setString(9, empresa.getGerente_general());
            st.setString(10, empresa.getAgente_retencion());
            st.setString(11, empresa.getCiudadela());
            st.setString(12, empresa.getBarrio());
            st.setString(13, empresa.getCarretero());
            st.setString(14, empresa.getNumero());
            st.setString(15, empresa.getInterseccion());
            st.setString(16, empresa.getManzana());
            st.setString(17, empresa.getSupermanzana());
            st.setString(18, empresa.getConjunto());
            st.setString(19, empresa.getCalle());
            st.setString(20, empresa.getNombre_edificio());
            st.setString(21, empresa.getNumero_piso());
            st.setString(22, empresa.getNumero_oficina());
            st.setString(23, empresa.getKilometro());
            st.setString(24, empresa.getCamino());
            st.setString(25, empresa.getReferencia());
            st.setString(26, empresa.getNumero_establecimiento());
            st.setString(27, empresa.getTipo_empresa());
            st.setInt(28, empresa.getNumero_empleados()!=null ? Integer.parseInt(empresa.getNumero_empleados().isEmpty()?"0":empresa.getNumero_empleados()):0);
            st.setDate(29, empresa.getFecha_inscripcion()==null ? null : Utilidades.getDate(empresa.getFecha_inscripcion().replace("\\", "")));
            st.setDate(30, empresa.getFecha_inicio()==null ? null : Utilidades.getDate(empresa.getFecha_inicio().replace("\\", "")));
            st.setDate(31, empresa.getFecha_constitucion()==null ? null : Utilidades.getDate(empresa.getFecha_constitucion().replace("\\", "")));
            st.setDate(32, empresa.getFecha_nombramiento()==null ? null : Utilidades.getDate(empresa.getFecha_nombramiento().replace("\\", "")));
            st.setString(33, empresa.getRuc());
            st.setString(34, empresa.getPersoneria());
            st.setString(35, empresa.getEstado_ruc());
            st.setString(36, empresa.getUbicacion());
            st.setString(37, empresa.getActividad());
            st.setString(38, empresa.getEstado_establecimiento());
            st.setString(39, empresa.getTelefonos());
            st.setString(40, empresa.getCedula_representante_legal());
            st.setString(41, empresa.getCedula_gerente_general());
            st.setString(42, empresa.getCargo_gerente_general());
            st.setDate(43, empresa.getFecha_nombramiento_gerente_general()==null ? null : Utilidades.getDate(empresa.getFecha_nombramiento_gerente_general().replace("\\", "")));
            st.setString(44, empresa.getTipo_establecimiento());
            st.setString(45, empresa.getCelulares());
            st.setString(46, empresa.getLista_blanca());
            st.setString(47, empresa.getTipo_contribuyente());
            st.setString(48, empresa.getRequiere_accionista());
            st.setString(49, empresa.getBeneficios_tributarios());
            st.setString(50, empresa.getDireccion());
            st.setString(51, empresa.getCodigo_ubicacion());
            st.setString(52, empresa.getCodigo_actividad());
            
            
            st.executeUpdate();
           
        } catch (SQLException ex) {
            throw ex;
        }finally{
          //cnConexion.close();
        } 
    }
    
    public void registraVehiculo(Vehiculo vehiculo) throws SQLException {
    
        Connection cnConexion=Conexion.getConexion();
        
        try 
        {            
            String sql="INSERT INTO sw_lavvehiculo(placa, marca, modelo, anio, clase, "
                    + "subclase, tipo, motor, chasis, cedula_propietario, nombre_propietario, "
                    + "pais, capacidad, cilindraje, combustible, estado_exoneracion, fecha_compra, "
                    + "fecha_caducidad, camv, carga_util, anio_fiscal, valor_avaluo, valor_impuesto, "
                    + "precio_venta, canton_matriculacion, color, fecha_nacimiento_propietario, "
                    + "estado_civil_propietario, genero_propietario, fecha_informacion) " +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, CURRENT YEAR TO SECOND) ";
            
            PreparedStatement st = cnConexion.prepareStatement(sql);
            
            st.setString(1, vehiculo.getPlaca());
            st.setString(2, vehiculo.getMarca());
            st.setString(3, vehiculo.getModelo());
            st.setInt(4, vehiculo.getAnio().isEmpty() ? 0 : Integer.parseInt(vehiculo.getAnio()));
            st.setString(5, vehiculo.getClase());
            st.setString(6, vehiculo.getSubclase());
            st.setString(7, vehiculo.getTipo());
            st.setString(8, vehiculo.getMotor());
            st.setString(9, vehiculo.getChasis());
            st.setString(10, vehiculo.getCedula_propietario());
            st.setString(11, vehiculo.getNombre_propietario());
            st.setString(12, vehiculo.getPais());
            st.setString(13, vehiculo.getCapacidad());
            st.setString(14, vehiculo.getCilindraje());
            st.setString(15, vehiculo.getCombustible());
            st.setString(16, vehiculo.getEstado_exoneracion());
            st.setDate(17, vehiculo.getFecha_compra()==null?null:Utilidades.getDate(vehiculo.getFecha_compra().replace("\\", "")));
            st.setDate(18, vehiculo.getFecha_caducidad()==null?null:Utilidades.getDate(vehiculo.getFecha_caducidad().replace("\\", "")));
            st.setString(19, vehiculo.getCamv());
            st.setString(20, vehiculo.getCarga_util());
            st.setInt(21, (vehiculo.getAnio_fiscal()==null || vehiculo.getAnio_fiscal().isEmpty()) ? 0: Integer.parseInt(vehiculo.getAnio_fiscal()));
            st.setDouble(22, (vehiculo.getValor_avaluo()==null || vehiculo.getValor_avaluo().isEmpty()) ? 0.0 : Double.parseDouble(vehiculo.getValor_avaluo().replace(",", ".")));
            st.setDouble(23, (vehiculo.getValor_impuesto()==null || vehiculo.getValor_impuesto().isEmpty()) ? 0.0 : Double.parseDouble(vehiculo.getValor_impuesto().replace(",", ".")));
            st.setDouble(24, (vehiculo.getPrecio_venta()==null || vehiculo.getPrecio_venta().isEmpty()) ? 0.0 : Double.parseDouble(vehiculo.getPrecio_venta().replace(",", ".")));
            st.setString(25, vehiculo.getCanton_matriculacion());
            st.setString(26, vehiculo.getColor());
            st.setDate(27, vehiculo.getFecha_caducidad()==null?null:Utilidades.getDate(vehiculo.getFecha_nacimiento_propietario().replace("\\", "")));
            st.setString(28, vehiculo.getEstado_civil_propietario());
            st.setString(29, vehiculo.getGenero_propietario());
            st.executeUpdate();
           
        } catch (SQLException ex) {
            throw ex;
        }finally{
          //cnConexion.close();
        } 
    }
    
    /**
     * Verifica si los datos de las tablas intermedias necesitan actualizacion
     * @param identificacion Identificacion (Cedula, RUC, Placa)
     * @param figura 1 Persona Natural, 2 Vehiculo, 3 Persona Juridica
     * @return A Datos Actualizado, D Datos Desactualizados
     * @throws SQLException 
     */
    public String verificarDataStupendo(String identificacion, int figura) throws SQLException
    {
        ResultSet r=null;
        String respuesta="";
        Connection cnConexion=Conexion.getConexion();
        
        try
        {
            CallableStatement cs=cnConexion.prepareCall
                    ("{call sw_c_spcomverificarstupendo(?,?)}");

            cs.setString(1, identificacion);
            cs.setInt(2, figura);            
            r=cs.executeQuery();
            
            if(r.next())
                respuesta=r.getString("respuesta");
            
            System.out.println("Respuesta: "+respuesta);
            
            cs.close();
            r.close();
        }
        catch(SQLException e)
        {
            throw e;
        }
        finally
        {
            //cnConexion.close();
        }
        
        return respuesta;
        
    }
    
    
}
