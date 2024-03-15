package br.gabrielbressi.designpatterns.observer.example02.classes;

import br.gabrielbressi.designpatterns.observer.example02.interfaces.IObserver;
import br.gabrielbressi.designpatterns.observer.example02.interfaces.ISubject;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {

    private List<IObserver> observer;


    public Subject() {
        observer = new ArrayList<>();
    }


    public List<IObserver> getObserver() {
        return this.observer;
    }

    @Override
    public void subscribe(IObserver observer) {
        this.observer.add(observer);
    }

    @Override
    public void unsubscribe(IObserver observer) {
        this.observer.remove(observer);
    }

    @Override
    public void usubscribeAll() {
        this.observer = new ArrayList<>();
    }

    @Override
    public void notify(IObserver observer) {
        observer.update();
    }

    @Override
    public void notifyAllObs(){
        observer.forEach(obs -> this.notify(obs));
    }
}
