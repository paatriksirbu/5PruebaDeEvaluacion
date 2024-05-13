package GestionCadenaRestaurantes.PatronesEstructuracion.RestaurantTypes;

import GestionCadenaRestaurantes.PatronesEstructuracion.Restaurant;

public class FastFoodRestaurant implements Restaurant {
    @Override
    public void prepareTables() {
        System.out.println("Preparing tables for fast food restaurant");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving food for fast food restaurant");

    }
}
