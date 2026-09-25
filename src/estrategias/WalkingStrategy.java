package estrategias;

public class WalkingStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String pointA, String pointB) {
        return " Ruta CAMINANDO calculada de '" + pointA + "' a '" + pointB + "'. Tiempo estimado: 1h 10 min.";
    }
}