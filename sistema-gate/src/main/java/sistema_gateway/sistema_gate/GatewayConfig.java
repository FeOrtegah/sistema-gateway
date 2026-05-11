package sistema_gateway.sistema_gate;

import java.net.URI;
import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class GatewayConfig {

    @Bean
    public RouterFunction<ServerResponse> apiUsuarios() {
        return GatewayRouterFunctions.route("api-usuarios")
                .route(RequestPredicates.path("/api/v1/usuarios/**"),
                        HandlerFunctions.http(URI.create("https://api-usuarios-nrht.onrender.com")))
                .route(RequestPredicates.path("/api/v1/perfiles/**"),
                        HandlerFunctions.http(URI.create("https://api-usuarios-nrht.onrender.com")))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> apiAcademica() {
        return GatewayRouterFunctions.route("api-academica")
                .route(RequestPredicates.path("/api/cursos/**"),
                        HandlerFunctions.http(URI.create("https://api-academica-w9eo.onrender.com")))
                .route(RequestPredicates.path("/api/asignaturas/**"),
                        HandlerFunctions.http(URI.create("https://api-academica-w9eo.onrender.com")))
                .route(RequestPredicates.path("/api/evaluaciones/**"),
                        HandlerFunctions.http(URI.create("https://api-academica-w9eo.onrender.com")))
                .route(RequestPredicates.path("/api/notas/**"),
                        HandlerFunctions.http(URI.create("https://api-academica-w9eo.onrender.com")))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> apiAsistencia() {
        return GatewayRouterFunctions.route("api-asistencia")
                .route(RequestPredicates.path("/api/v1/asistencias/**"),
                        HandlerFunctions.http(URI.create("https://api-asistencia-bo6s.onrender.com")))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> apiComunicacion() {
        return GatewayRouterFunctions.route("api-comunicacion")
                .route(RequestPredicates.path("/api/mensajes/**"),
                        HandlerFunctions.http(URI.create("https://api-comunicacion.onrender.com")))
                .route(RequestPredicates.path("/api/conversaciones/**"),
                        HandlerFunctions.http(URI.create("https://api-comunicacion.onrender.com")))
                .route(RequestPredicates.path("/api/notificaciones/**"),
                        HandlerFunctions.http(URI.create("https://api-comunicacion.onrender.com")))
                .route(RequestPredicates.path("/api/grupos/**"),
                        HandlerFunctions.http(URI.create("https://api-comunicacion.onrender.com")))
                .route(RequestPredicates.path("/api/adjuntos/**"),
                        HandlerFunctions.http(URI.create("https://api-comunicacion.onrender.com")))
                .route(RequestPredicates.path("/api/plantillas/**"),
                        HandlerFunctions.http(URI.create("https://api-comunicacion.onrender.com")))
                .route(RequestPredicates.path("/api/mensajes-grupales/**"),
                        HandlerFunctions.http(URI.create("https://api-comunicacion.onrender.com")))
                .build();
    }
}
