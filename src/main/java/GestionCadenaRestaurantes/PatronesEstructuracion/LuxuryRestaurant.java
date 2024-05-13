package GestionCadenaRestaurantes.PatronesEstructuracion;

public class LuxuryRestaurant implements Restaurant{
    @Override
    public void prepareTables() {
        System.out.println("Preparing tables for luxury restaurant");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving food for luxury restaurant");

    }
}