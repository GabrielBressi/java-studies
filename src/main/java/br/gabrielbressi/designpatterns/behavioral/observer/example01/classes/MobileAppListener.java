package br.gabrielbressi.designpatterns.behavioral.observer.example01.classes;

import br.gabrielbressi.designpatterns.behavioral.observer.example01.interfaces.EventListener;

public class MobileAppListener implements EventListener {
    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }


    @Override
    public void update(Event eventType) {
        // Actually send the push notification
    }
}
