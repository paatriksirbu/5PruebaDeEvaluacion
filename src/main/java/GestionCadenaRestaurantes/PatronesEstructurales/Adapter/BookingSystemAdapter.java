package GestionCadenaRestaurantes.PatronesEstructurales.Adapter;

import GestionCadenaRestaurantes.PatronesConstruccion.Interface.Restaurant;

public class BookingSystemAdapter implements Restaurant {
    private ExternalBookingSystem bookingSystem;

    public BookingSystemAdapter(ExternalBookingSystem bookingSystem) {
        this.bookingSystem = bookingSystem;
    }

    @Override
    public void prepareTables() {
        bookingSystem.bookTable();
    }

    @Override
    public void serveFood() {
        System.out.println("The external booking system does not serve food.");
    }
}
