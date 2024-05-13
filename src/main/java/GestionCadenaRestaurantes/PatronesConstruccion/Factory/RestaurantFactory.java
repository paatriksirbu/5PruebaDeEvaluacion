package GestionCadenaRestaurantes.PatronesConstruccion.Factory;
import GestionCadenaRestaurantes.PatronesConstruccion.RestaurantTypes.*;
import GestionCadenaRestaurantes.PatronesConstruccion.Interface.Restaurant;

public class RestaurantFactory {
    public static Restaurant getRestaurant(String type) {
        switch (type) {
            case "luxury":
                return new LuxuryRestaurant();
            case "fast food":
                return new FastFoodRestaurant();
            case "mexican":
                return new MexicanRestaurant();
            default:
                throw new IllegalArgumentException("Invalid restaurant type. Please try again.");
        }
    }
}
