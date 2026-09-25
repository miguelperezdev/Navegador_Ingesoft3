package contexto;

import estrategias.RouteStrategy;

public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public String buildRoute(String pointA, String pointB) {
        if (routeStrategy == null) {
            throw new IllegalStateException("Error: No se ha definido una estrategia de navegación.");
        }
        String route = routeStrategy.buildRoute(pointA, pointB);
        return route;
    }
}