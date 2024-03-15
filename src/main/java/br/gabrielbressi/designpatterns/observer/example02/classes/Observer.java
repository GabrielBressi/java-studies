package br.gabrielbressi.designpatterns.observer.example02.classes;

import br.gabrielbressi.designpatterns.observer.example02.interfaces.IObserver;

public class Observer implements IObserver {

    private int id;

    public Observer(int id) {
        this.id = id;
    }

    @Override
    public void update() {
        System.out.printf("Observer %d updated\n", id);
    }

    public int getId() {
        return this.id;
    }
}
