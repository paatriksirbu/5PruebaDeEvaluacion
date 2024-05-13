package GestionCadenaRestaurantes.PatronesConstruccion.RestaurantTypes;

import GestionCadenaRestaurantes.PatronesConstruccion.Interface.Restaurant;

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
