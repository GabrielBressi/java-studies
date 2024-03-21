package br.gabrielbressi.designpatterns.behavioral.observer.example01.classes;

import br.gabrielbressi.designpatterns.behavioral.observer.example01.interfaces.EventListener;

import java.util.*;

public class NotificationService {

    private final Map<Event, List<EventListener>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(
                event -> customers.put(event, new ArrayList<>())
        );
    }

    public void subscribe(Event eventType, EventListener listener) {
        customers.get(eventType).add(listener);
    }


    public void unsubscribe(Event eventType, EventListener listener) {
        customers.get(eventType).remove(listener);
    }

    public void notify(Event eventType) {
        customers.get(eventType).forEach(
                listener -> listener.update(eventType)
        );
    }

}
