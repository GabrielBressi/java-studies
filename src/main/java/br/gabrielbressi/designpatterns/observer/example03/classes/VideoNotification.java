package br.gabrielbressi.designpatterns.observer.example03.classes;

import br.gabrielbressi.designpatterns.observer.example03.IObserver;
import br.gabrielbressi.designpatterns.observer.example03.ISubject;

import java.util.ArrayList;
import java.util.List;

public class VideoNotification implements ISubject {

    private List<IObserver> observers;
    private Video video;

    public VideoNotification(Video video) {
        this.observers = new ArrayList<>();
        this.video = video;
    }

    @Override
    public void subscribe(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void unsubscribeAll() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void notify(IObserver observer) {
        observer.update(this.video);
    }

    @Override
    public void notifyAllObs() {
        this.observers.forEach(obs -> this.notify(obs));
    }
}
