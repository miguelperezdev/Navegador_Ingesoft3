import contexto.Navigator;
import estrategias.RoadStrategy;
import estrategias.PublicTransportStrategy;
import estrategias.WalkingStrategy;

public class Main {
    public static void main(String[] args) {
        String origen = "Plaza Mayor";
        String destino = "Aeropuerto Internacional";

        Navigator navigator = new Navigator(new RoadStrategy());
        System.out.println("--- El viajero elige: Coche ---");
        System.out.println(navigator.buildRoute(origen, destino));

        navigator.setRouteStrategy(new PublicTransportStrategy());
        System.out.println("\n--- El viajero cambia a: Transporte Público ---");
        System.out.println(navigator.buildRoute(origen, destino));

        navigator.setRouteStrategy(new WalkingStrategy());
        System.out.println("\n--- El viajero decide: Caminar ---");
        System.out.println(navigator.buildRoute(origen, destino));
    }
}