
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
    public int insertAll(VisitasDTO visita) throws SQLException; // Inserta todos los datos, independientemente de los que son nulos
    public int insertNotNulls(VisitasDTO visita) throws SQLException; // Inserta todos los datos no nulos
    public int updateNombres(VisitasDTO visita) throws SQLException;
    public int updateApellidoPaterno(VisitasDTO visita) throws SQLException;
    public int updateApellidoMaterno(VisitasDTO visita) throws SQLException;
    public int updateNumeroCasa(VisitasDTO visita) throws SQLException;
    public int updateMatriculaVehiculo(VisitasDTO visita) throws SQLException;
    public int updateFechaEntrada(VisitasDTO visita) throws SQLException;
    public int updateFechaSalida(VisitasDTO visita) throws SQLException;
    public int updateTipo(VisitasDTO visita) throws SQLException;
    public int updateDependencia(VisitasDTO visita) throws SQLException;
    public int updateCedula(VisitasDTO visita) throws SQLException;
    public int updateVigilante(VisitasDTO visita) throws SQLException;
    public int deleteAll() throws SQLException;
    public int deleteOne(int idVisitas) throws SQLException;
    
}
