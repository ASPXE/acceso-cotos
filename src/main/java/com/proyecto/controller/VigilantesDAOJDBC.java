
package com.proyecto.controller;

import com.proyect.dao.VigilantesDAO;
import com.proyecto.objects.VigilantesDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author aspxe
 */
public class VigilantesDAOJDBC implements VigilantesDAO{

    @Override
    public List<VigilantesDTO> selectAll() throws SQLException {
        return null;
    }

    @Override
    public VigilantesDTO selectOne(int idVigilantes) throws SQLException {
        return null;
    }

    @Override
    public boolean validarUsuario(String nombreUsuario, String passwd) throws SQLException {
        return false;
    }
    
}
