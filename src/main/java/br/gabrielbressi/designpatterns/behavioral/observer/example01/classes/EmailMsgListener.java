package br.gabrielbressi.designpatterns.behavioral.observer.example01.classes;

import br.gabrielbressi.designpatterns.behavioral.observer.example01.interfaces.EventListener;

public class EmailMsgListener implements EventListener {

    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    public void update(Event eventType) {
        // Actually send the email
    }

}
