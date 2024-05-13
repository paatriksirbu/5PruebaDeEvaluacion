package GestionCadenaRestaurantes.PatronesEstructurales;

import GestionCadenaRestaurantes.PatronesEstructurales.Interface.RestaurantComponent;

import java.util.ArrayList;
import java.util.List;

class RestaurantComposite implements RestaurantComponent {
    private List<RestaurantComponent> children = new ArrayList<>();
    private String name;  // Nombre del grupo de restaurantes para identificación

    public RestaurantComposite(String name) {
        this.name = name;
    }

    @Override
    public void prepareTables() {
        for (RestaurantComponent child : children) {
            child.prepareTables();
        }
    }

    @Override
    public void serveFood() {
        for (RestaurantComponent child : children) {
            child.serveFood();
        }
    }

    @Override
    public void add(RestaurantComponent component) {
        children.add(component);
    }

    @Override
    public void remove(RestaurantComponent component) {
        children.remove(component);
    }

    @Override
    public List<RestaurantComponent> getChildren() {
        return children;
    }
}