
package com.proyecto.controller;

import com.proyect.dao.VigilantesDAO;
import com.proyecto.connection.Conexion;
import com.proyecto.objects.VigilantesDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aspxe
 */
public class VigilantesDAOJDBC implements VigilantesDAO{
    
    private Connection conexionTransaccional;
    
    public VigilantesDAOJDBC(){
        
    }
    
    public VigilantesDAOJDBC(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }
    
    private static final String SQL_SELECT_ALL = "SELECT * FROM Vigilantes";
    private static final String SQL_SELECT_ONE = "SELECT * FROM Vigilantes WHERE idVigilantes = ?";
    private static final String SQL_VALIDAR_USUARIO = "SELECT nombreUsuario, passwd FROM Vigilantes WHERE nombreUsuario = ? AND passwd = ?";

    @Override
    public List<VigilantesDTO> selectAll() throws SQLException {
        
        String nombres = "", apellidoPaterno = "", apellidoMaterno = "", nombreUsuario = "",
                passwd = "", horario = "";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        VigilantesDTO vigilante = null;
        List<VigilantesDTO> vigilantes = new ArrayList<>();
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VigilantesDAOJDBC.SQL_SELECT_ALL);
            rs = stmt.executeQuery();
            while(rs.next()){
                nombres = rs.getString("nombres");
                apellidoPaterno = rs.getString("apellidoPaterno");
                apellidoMaterno = rs.getString("apellidoMaterno");
                nombreUsuario = rs.getString("nombreUsuario");
                passwd = rs.getString("passwd");
                horario = rs.getString("horario");
                
                vigilante = new VigilantesDTO(nombres, apellidoPaterno, apellidoMaterno, nombreUsuario,
                passwd, horario);
                vigilantes.add(vigilante);
            }
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de recuperar el registro de Vigilantes: "+e);
        }finally{
            Conexion.cerrar(rs);
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return vigilantes;
        
    }

    @Override
    public VigilantesDTO selectOne(int idVigilantes) throws SQLException {
        
        String nombres = "", apellidoPaterno = "", apellidoMaterno = "", nombreUsuario = "",
                passwd = "", horario = "";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        VigilantesDTO vigilante = null;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VigilantesDAOJDBC.SQL_SELECT_ONE);
            stmt.setInt(1, idVigilantes);
            rs = stmt.executeQuery();
            while(rs.next()){
                nombres = rs.getString("nombres");
                apellidoPaterno = rs.getString("apellidoPaterno");
                apellidoMaterno = rs.getString("apellidoMaterno");
                nombreUsuario = rs.getString("nombreUsuario");
                passwd = rs.getString("passwd");
                horario = rs.getString("horario");
                
                vigilante = new VigilantesDTO(nombres, apellidoPaterno, apellidoMaterno, nombreUsuario,
                passwd, horario);
            }
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de recuperar el registro de Vigilantes: "+e);
        }finally{
            Conexion.cerrar(rs);
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        return vigilante;
       
    }

    @Override
    public boolean validarUsuario(String nombreUsuario, String passwd) throws SQLException {
        
        String nombresUsuarioRecuperado = "", passwdRecuperado = "";
        boolean esValido = false;
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.conectar();
            stmt = conn.prepareStatement(VigilantesDAOJDBC.SQL_VALIDAR_USUARIO);
            stmt.setString(1, nombreUsuario);
            stmt.setString(2, passwd);
            rs = stmt.executeQuery();
            while(rs.next()){
                nombresUsuarioRecuperado = rs.getString("nombreUsuario");
                passwdRecuperado = rs.getString("passwd");
            }
        }catch(SQLException e){
            System.out.println("Ha ocurrido un error al tratar de recuperar el registro de Vigilantes: "+e);
        }finally{
            Conexion.cerrar(rs);
            Conexion.cerrar(stmt);
            if(this.conexionTransaccional == null){
                Conexion.cerrar(conn);
            }
        }
        
        if(nombreUsuario.equals(nombresUsuarioRecuperado) && passwd.equals(passwdRecuperado)){
            esValido = true;
        }
        
        return esValido;
        
    }
    
}
