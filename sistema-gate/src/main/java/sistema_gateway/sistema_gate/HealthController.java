package sistema_gateway.sistema_gate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.mvc.config.GatewayMvcProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @Autowired
    private GatewayMvcProperties properties;

    @GetMapping("/")
    public String health() {
        return "Gateway funcionando. Rutas: " + properties.getRoutes().size();
    }
}
