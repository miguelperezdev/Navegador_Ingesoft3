package estrategias;

public class RoadStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String pointA, String pointB) {
        return "Ruta por CARRETERA calculada de '" + pointA + "' a '" + pointB + "'. Tiempo estimado: 25 min.";
    }
}