package br.gabrielbressi.designpatterns.observer.example01.interfaces;

import br.gabrielbressi.designpatterns.observer.example01.classes.Event;

public interface EventListener {
    void update(Event eventType);
}
