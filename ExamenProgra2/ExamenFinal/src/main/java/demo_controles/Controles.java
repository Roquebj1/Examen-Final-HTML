
package demo_controles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author HP
 */
@Controller
public class Controles {
    @GetMapping({"/", "/Inicio", "/index"})
    public String index(){
        return "Inicio";
    }
}
