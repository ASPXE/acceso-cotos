
package com.proyecto.controller;

import com.proyect.dao.VisitasDAO;
import com.proyecto.connection.Conexion;
import com.proyecto.objects.VisitasDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aspxe
 */
public class VisitasDAOJDBC implements VisitasDAO{
    
    // Para la conexión transaccional
    private Connection conexionTransaccional;
    
    
    // Constructor vacio
    public VisitasDAOJDBC(){
        
    }
    
    // Metodo con conexionTransaccional
    public VisitasDAOJDBC(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }
    
    private static final String SQL_SELECT_ALL = "SELECT * FROM Visitas";
    private static final String SQL_SELECT_ONE = "SELECT * FROM Visitas WHERE idVistas = ?";
    private static final String SQL_INSERT_ALL = "INSERT INTO Visitas(nombres, numeroCasa,"
            + "matriculaVehiculo, fechaEntrada, fechaSalida, tipo, dependencia, cedula, vigilante) VALUES(?, ?, ?,"
            + "?, ?, ?, ?, ?, ?)";
    private static final String SQL_INSERT_NOT_NULLS = "INSERT INTO Visitas(nombres, apellidoPaterno, numeroCasa,"
            + "fechaEntrada, tipo, vigilante) VALUES(?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE_NOMBRES = "UPDATE Visitas SET nombres = ? WHERE idVisitas = ?";
    private static final String SQL_UPDATE_APELLIDO_PATERNO = "UPDATE Visitas SET apellidoPaterno = ? WHERE idVisitas = ?";
    private static final String SQL_UPDATE_APELLIDO_MATERNO = "UPDATE Visitas SET apellidoMaterno = ? WHERE idVisitas = ?";
    private static final String SQL_UPDATE_NUMERO_CASA = "UPDATE Visitas SET numeroCasa = ? WHERE idVisitas = ?";
    private static final String SQL_UPDATE_MATRICULA_VEHICULO = "UPDATE Visitas SET matriculaVehiculo = ? WHERE idVisitas = ?";
    private static final String SQL_UPDATE_FECHA_ENTRADA = "UPDATE Visitas SET fechaEntrada = ? WHERE idVisitas = ?";
    private static final String SQL_UPDATE_FECHA_SALIDA = "UPDATE Visitas SET fechaSalida = ? WHERE idVisitas = ?";
    private static final String SQL_UPDATE_TIPO = "UPDATE Visitas SET tipo = ? WHERE idVisitas = ?";
    private static final String SQL_UPDATE_DEPENDENCIA = "UPDATE Visitas SET dependencia = ? WHERE idVisitas = ?";
    private static final String SQL_UPDATE_CEDULA = "UPDATE Visitas SET cedula = ? WHERE idVisitas = ?";
    private static final String SQL_UPDATE_VIGILANTE = "UPDATE Visitas SET vigilante = ? WHERE idVisitas = ?";
    private static final String SQL_DELETE_ALL = "DELETE FROM Visitas";
    private static final String SQL_DELETE_ONE = "DELETE FROM Visitas WHERE idVisitas = ?";

    @Override
    public List<VisitasDTO> selectAll() throws SQLException {
        
        String nombres = "", apellidoPaterno = "", apellidoMaterno = "", tipo = "",
                dependencia = "", cedula = "", matriculaVehiculo = "";
        int numeroCasa = 0, vigilante = 0;
        Timestamp fechaEntrada, fechaSalida;
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        VisitasDTO visita = null;
        List<VisitasDTO> visitas = new ArrayList<>();
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_SELECT_ALL);
            rs = stmt.executeQuery();
            while(rs.next()){
                nombres = rs.getString("nombres");
                apellidoPaterno = rs.getString("apellidoPaterno");
                apellidoMaterno = rs.getString("apellidoMaterno");
                numeroCasa = rs.getInt("numeroCasa");
                matriculaVehiculo = rs.getString("matriculaVehiculo");
                fechaEntrada = rs.getTimestamp("fechaEntrada");
                fechaSalida = rs.getTimestamp("fechaSalida");
                tipo = rs.getString("tipo");
                dependencia = rs.getString("dependencia");
                cedula = rs.getString("cedula");
                vigilante = rs.getInt("vigilante");
                
                visita = new VisitasDTO(nombres, apellidoPaterno, apellidoMaterno,
                numeroCasa, matriculaVehiculo, fechaEntrada, fechaSalida, tipo, dependencia,
                cedula, vigilante);
                visitas.add(visita);
            }
        }catch(SQLException e){
            System.out.println("HA ocurrio un error al tratar de recuperar los registros de Visitas: "+e);
        }finally{
            Conexion.cerrar(rs);
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return visitas;
        
    }

    @Override
    public VisitasDTO selectOne(int idVisitas) throws SQLException {
        
        String nombres = "", apellidoPaterno = "", apellidoMaterno = "", tipo = "",
                dependencia = "", cedula = "", matriculaVehiculo = "";
        int numeroCasa = 0, vigilante = 0;
        Timestamp fechaEntrada, fechaSalida;
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        VisitasDTO visita = null;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_SELECT_ALL);
            stmt.setInt(1, idVisitas);
            rs = stmt.executeQuery();
            while(rs.next()){
                nombres = rs.getString("nombres");
                apellidoPaterno = rs.getString("apellidoPaterno");
                apellidoMaterno = rs.getString("apellidoMaterno");
                numeroCasa = rs.getInt("numeroCasa");
                matriculaVehiculo = rs.getString("matriculaVehiculo");
                fechaEntrada = rs.getTimestamp("fechaEntrada");
                fechaSalida = rs.getTimestamp("fechaSalida");
                tipo = rs.getString("tipo");
                dependencia = rs.getString("dependencia");
                cedula = rs.getString("cedula");
                vigilante = rs.getInt("vigilante");
                
                visita = new VisitasDTO(nombres, apellidoPaterno, apellidoMaterno,
                numeroCasa, matriculaVehiculo, fechaEntrada, fechaSalida, tipo, dependencia,
                cedula, vigilante);
            }
        }catch(SQLException e){
            System.out.println("Ha ocurrio un error al tratar de recuperar el registro de Visitas: "+e);
        }finally{
            Conexion.cerrar(rs);
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return visita;
        
    }

    @Override
    public int insertAll(VisitasDTO visita) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_INSERT_ALL);
            stmt.setString(1, visita.getNombres());
            stmt.setInt(2, visita.getNumeroCasa());
            stmt.setString(3, visita.getMatriculaVehiculo());
            stmt.setTimestamp(4, visita.getFechaEntrada());
            stmt.setTimestamp(5, visita.getFechaSalida());
            stmt.setString(6, visita.getTipo());
            stmt.setString(7, visita.getDependencia());
            stmt.setString(8, visita.getCedula());
            stmt.setInt(9, visita.getVigilante());
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de insertar el registro en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }

    @Override
    public int insertNotNulls(VisitasDTO visita) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_INSERT_NOT_NULLS);
            stmt.setString(1, visita.getNombres());
            stmt.setString(2, visita.getApellidoPaterno());
            stmt.setInt(3, visita.getNumeroCasa());
            stmt.setTimestamp(4, visita.getFechaEntrada());
            stmt.setString(5, visita.getTipo());
            stmt.setInt(6, visita.getVigilante());
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de insertar el registro en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }

    @Override
    public int updateNombres(VisitasDTO visita) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_UPDATE_NOMBRES);
            stmt.setString(1, visita.getNombres());
            stmt.setInt(2, visita.getIdVisitas());
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de actualizar el registro en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }

    @Override
    public int updateApellidoPaterno(VisitasDTO visita) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_UPDATE_APELLIDO_PATERNO);
            stmt.setString(1, visita.getApellidoPaterno());
            stmt.setInt(2, visita.getIdVisitas());
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de actualizar el registro en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }

    @Override
    public int updateApellidoMaterno(VisitasDTO visita) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_UPDATE_APELLIDO_MATERNO);
            stmt.setString(1, visita.getApellidoMaterno());
            stmt.setInt(2, visita.getIdVisitas());
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de actualizar el registro en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }

    @Override
    public int updateNumeroCasa(VisitasDTO visita) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_UPDATE_NUMERO_CASA);
            stmt.setInt(1, visita.getNumeroCasa());
            stmt.setInt(2, visita.getIdVisitas());
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de actualizar el registro en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }

    @Override
    public int updateMatriculaVehiculo(VisitasDTO visita) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_UPDATE_MATRICULA_VEHICULO);
            stmt.setString(1, visita.getMatriculaVehiculo());
            stmt.setInt(2, visita.getIdVisitas());
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de actualizar el registro en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }

    @Override
    public int updateFechaEntrada(VisitasDTO visita) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_UPDATE_FECHA_ENTRADA);
            stmt.setTimestamp(1, visita.getFechaEntrada());
            stmt.setInt(2, visita.getIdVisitas());
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de actualizar el registro en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }

    @Override
    public int updateFechaSalida(VisitasDTO visita) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_UPDATE_FECHA_SALIDA);
            stmt.setTimestamp(1, visita.getFechaSalida());
            stmt.setInt(2, visita.getIdVisitas());
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de actualizar el registro en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }

    @Override
    public int updateTipo(VisitasDTO visita) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_UPDATE_TIPO);
            stmt.setString(1, visita.getTipo());
            stmt.setInt(2, visita.getIdVisitas());
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de actualizar el registro en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }

    @Override
    public int updateDependencia(VisitasDTO visita) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_UPDATE_DEPENDENCIA);
            stmt.setString(1, visita.getDependencia());
            stmt.setInt(2, visita.getIdVisitas());
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de actualizar el registro en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }

    @Override
    public int updateCedula(VisitasDTO visita) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_UPDATE_CEDULA);
            stmt.setString(1, visita.getCedula());
            stmt.setInt(2, visita.getIdVisitas());
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de actualizar el registro en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }

    @Override
    public int updateVigilante(VisitasDTO visita) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_UPDATE_VIGILANTE);
            stmt.setInt(1, visita.getVigilante());
            stmt.setInt(2, visita.getIdVisitas());
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de actualizar el registro en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }

    @Override
    public int deleteAll() throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_DELETE_ALL);
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de eliminar los registros en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }

    @Override
    public int deleteOne(int idVisitas) throws SQLException {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VisitasDAOJDBC.SQL_DELETE_ONE);
            stmt.setInt(1, idVisitas);
            registros = stmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de eliminar el registro en Visitas: "+e);
        }finally{
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return registros;
        
    }
    
}
