package GestionCadenaRestaurantes.PatronesEstructurales;

import GestionCadenaRestaurantes.PatronesEstructurales.Interface.RestaurantComponent;

import java.util.List;

public class RestaurantLeaf implements RestaurantComponent {
    private String name;

    public RestaurantLeaf(String name) {
        this.name = name;
    }

    @Override
    public void prepareTables() {
        System.out.println("Preparing tables for " + name);
    }

    @Override
    public void serveFood() {
        System.out.println("Serving food for " + name);
    }

    @Override
    public void add(RestaurantComponent restaurantComponent) {
        throw new UnsupportedOperationException("Leaf nodes cannot have children");
    }

    @Override
    public void remove(RestaurantComponent restaurantComponent) {
        throw new UnsupportedOperationException("Leaf nodes cannot remove components.");
    }

    @Override
    public List<RestaurantComponent> getChildren() {
        return null;
    }
}
