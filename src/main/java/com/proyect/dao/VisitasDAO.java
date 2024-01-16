
package com.proyect.dao;

import com.proyecto.objects.VisitasDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author aspxe
 */
public interface VisitasDAO {
    
    public List<VisitasDTO> selectAll() throws SQLException;
    public VisitasDTO selectOne(int idVisitas) throws SQLException;
    public int insertAll() throws SQLException; // Inserta todos los datos, independientemente de los que son nulos
    public int insertNotNulls() throws SQLException; // Inserta todos los datos no nulos
    public int updateNombres(VisitasDTO visita) throws SQLException;
    
}
