package demo_servicios;

import com.Final.demo.modelos.e.Profesiones;
import java.util.List;

/**
 *
 * @author HP
 */
public interface InProfesionServicios {
    List<Profesiones> listar();
    void guardar(Profesiones profesion);
    Profesiones buscarPorId(Long id);
    void eliminar(Long id);
    
}
