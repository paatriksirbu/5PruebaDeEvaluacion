package GestionCadenaRestaurantes.PatronesEstructurales.Composite.Interface;

import java.util.List;

public interface RestaurantComponent {
    void prepareTables();
    void serveFood();
    void add(RestaurantComponent restaurantComponent);
    void remove(RestaurantComponent restaurantComponent);
    List<RestaurantComponent> getChildren();
}
