
package demo_servicios;

import com.Final.demo.modelos.e.Departamentos;
import java.util.List;

/**
 *
 * @author HP
 */
public interface InDepartamentoServicios {
    List<Departamentos> listar();
    void guardar(Departamentos departamento);
    Departamentos buscarPorId(Long id);
    void eliminar(Long id);
    
}
