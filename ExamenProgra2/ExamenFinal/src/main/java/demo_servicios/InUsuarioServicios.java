package demo_servicios;

import com.Final.demo.modelos.e.UsuarioDepartamento;
import com.Final.demo.modelos.e.Usuarios;
import java.util.List;

/**
 *
 * @author HP
 */
public interface InUsuarioServicios {
    List<Usuarios> listarUsuarios();
    void guardar(Usuarios usuario);
    Usuarios buscarPorId(Long id);
    void eliminar(Long id);
    List<UsuarioDepartamento> obtenerUsuariosDto();
    
}
