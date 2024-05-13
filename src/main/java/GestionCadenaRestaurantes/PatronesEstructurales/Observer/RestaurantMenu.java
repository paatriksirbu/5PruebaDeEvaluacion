package GestionCadenaRestaurantes.PatronesEstructurales.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class RestaurantMenu implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private List<String> items;


    public RestaurantMenu() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        notifyUpdate(new Message("New item added: " + item));
    }

    public void removeItem(String item) {
        items.remove(item);
        notifyUpdate(new Message("Item removed: " + item));
    }

    public List<String> getItems() {
        return items;
    }


    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Message m) {
        for (Observer o : observers) {
            o.update(m);
        }
    }
}
