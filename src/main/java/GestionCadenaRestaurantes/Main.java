package GestionCadenaRestaurantes;

import GestionCadenaRestaurantes.PatronesConstruccion.Manager.RestaurantManager;
import GestionCadenaRestaurantes.PatronesConstruccion.RestaurantTypes.*;

public class Main {
    public static void main(String[] args) {
        RestaurantManager restaurantManager = RestaurantManager.getInstance();

        System.out.println("        --Restaurant Manager--");
        restaurantManager.addRestaurant(new FastFoodRestaurant());
        restaurantManager.addRestaurant(new MexicanRestaurant());
        restaurantManager.addRestaurant(new LuxuryRestaurant());

        System.out.println("Preparing all tables...");
        restaurantManager.prepareAllTables();
        System.out.println("\n");

        System.out.println("Serving all food...");
        restaurantManager.serveAllFood();
        System.out.println("\n");

    }
}
