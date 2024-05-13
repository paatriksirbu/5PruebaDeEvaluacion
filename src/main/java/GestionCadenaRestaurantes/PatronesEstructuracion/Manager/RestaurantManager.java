package GestionCadenaRestaurantes.PatronesEstructuracion.Manager;

import GestionCadenaRestaurantes.PatronesEstructuracion.Restaurant;

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

}
