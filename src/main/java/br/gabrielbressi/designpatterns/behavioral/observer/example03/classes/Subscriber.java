package br.gabrielbressi.designpatterns.behavioral.observer.example03.classes;

import br.gabrielbressi.designpatterns.behavioral.observer.example03.IObserver;


/**
 * This class represents a subscriber to a YouTube channel for instance
 * */
public class Subscriber implements IObserver {

    private int id;
    private String name;


    public Subscriber(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void update(Video video) {
        System.out.printf("name:%s was notify about - %s\n", this.name, video.getTitle());
    }
}
