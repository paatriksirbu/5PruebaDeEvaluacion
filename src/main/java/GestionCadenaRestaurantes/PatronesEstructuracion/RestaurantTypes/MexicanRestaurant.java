package GestionCadenaRestaurantes.PatronesEstructuracion.RestaurantTypes;

import GestionCadenaRestaurantes.PatronesEstructuracion.Restaurant;

public class MexicanRestaurant implements Restaurant {
    @Override
    public void prepareTables() {
        System.out.println("Preparing tables for mexican restaurant");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving food for mexican restaurant");
    }
}