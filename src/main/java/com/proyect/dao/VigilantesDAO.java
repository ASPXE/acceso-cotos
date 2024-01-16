
package com.proyect.dao;

import com.proyecto.objects.VigilantesDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author aspxe
 */
public interface VigilantesDAO {
    
    public List<VigilantesDTO> selectAll() throws SQLException;
    public VigilantesDTO selectOne(int idVigilantes) throws SQLException;
    public boolean validarUsuario(String nombreUsuario, String passwd) throws SQLException;
    
    
}
