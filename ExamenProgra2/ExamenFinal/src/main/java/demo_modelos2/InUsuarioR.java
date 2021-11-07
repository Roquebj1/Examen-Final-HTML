package demo_modelos2;

import com.Final.demo.modelos.e.Usuarios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */

@Repository
public interface InUsuarioR extends CrudRepository<Usuarios, Long> {
    
}
