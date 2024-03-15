package br.gabrielbressi.designpatterns.behavioral.observer.example01.interfaces;

import br.gabrielbressi.designpatterns.behavioral.observer.example01.classes.Event;

public interface EventListener {
    void update(Event eventType);
}
