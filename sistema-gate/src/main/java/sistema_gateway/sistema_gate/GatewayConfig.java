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

                // Usuarios
                .route("usuarios", r -> r.path("/api/v1/usuarios/**")
                        .uri("https://api-usuarios-nrht.onrender.com"))

                .route("perfiles", r -> r.path("/api/v1/perfiles/**")
                        .uri("https://api-usuarios-nrht.onrender.com"))

                // Academica
                .route("academica", r -> r.path(
                        "/api/cursos/**",
                        "/api/asignaturas/**",
                        "/api/evaluaciones/**",
                        "/api/notas/**")
                        .uri("https://api-academica-w9eo.onrender.com"))

                // Asistencia
                .route("asistencia", r -> r.path(
                        "/api/asistencias/**",
                        "/api/anotaciones/**",
                        "/api/justificaciones/**")
                        .uri("https://api-asistencia-node.onrender.com"))

                // Comunicaci0n
                .route("comunicacion", r -> r.path(
                        "/api/mensajes/**",
                        "/api/conversaciones/**",
                        "/api/notificaciones/**",
                        "/api/grupos/**",
                        "/api/adjuntos/**",
                        "/api/plantillas/**",
                        "/api/mensajes-grupales/**",
                        "/api/configuracion-notificaciones/**",
                        "/api/comunicacion/**")
                        .uri("https://api-comunicacion.onrender.com"))

                .build();
    }
}
