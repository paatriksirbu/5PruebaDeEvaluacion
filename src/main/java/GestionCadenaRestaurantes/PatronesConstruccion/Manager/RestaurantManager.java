package GestionCadenaRestaurantes.PatronesConstruccion.Manager;

import GestionCadenaRestaurantes.PatronesConstruccion.Interface.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {

    private static RestaurantManager instance;
    private List<Restaurant> restaurants;

    private RestaurantManager() {
        restaurants = new ArrayList<>();
    }

    public static RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void prepareAllTables() {
        for (Restaurant restaurant : restaurants) {
            restaurant.prepareTables();
        }
    }

    public void serveAllFood() {
        for (Restaurant restaurant : restaurants) {
            restaurant.serveFood();
        }
    }

}
