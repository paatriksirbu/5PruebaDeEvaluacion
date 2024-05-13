package GestionCadenaRestaurantes.PatronesEstructurales.Observer;

import java.util.Observer;

public class Customer implements Observer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Message message) {
        System.out.println("Customer " + name + " received message: " + message.getContent());
    }
}
