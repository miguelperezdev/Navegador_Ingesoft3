package estrategias;

public class PublicTransportStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String pointA, String pointB) {
        return " Ruta en TRANSPORTE PÚBLICO calculada de '" + pointA + "' a '" + pointB + "'. Tiempo estimado: 45 min.";
    }
}