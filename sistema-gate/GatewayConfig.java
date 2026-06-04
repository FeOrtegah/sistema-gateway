package sistema_gateway.sistema_gate;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("usuarios", r -> r.path("/api/v1/usuarios/**")
                .filters(f -> f.stripPrefix(2)) // quita "/api/v1"
                .uri("https://api-usuarios.onrender.com"))
            .route("academica", r -> r.path("/api/v1/academica/**")
                .filters(f -> f.stripPrefix(2))
                .uri("https://api-academica.onrender.com"))
            .route("comunicacion", r -> r.path("/api/v1/comunicacion/**")
                .filters(f -> f.stripPrefix(2))
                .uri("https://api-comunicacion.onrender.com"))
            .route("asistencia", r -> r.path("/api/v1/asistencia/**")
                .filters(f -> f.stripPrefix(2))
                .uri("https://api-asistencia-node.onrender.com"))
            .build();
    }
}
