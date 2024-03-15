package br.gabrielbressi.designpatterns.observer.example02.interfaces;

public interface ISubject {

    void subscribe(IObserver observer);
    void unsubscribe(IObserver observer);
    void usubscribeAll();
    void notify(IObserver observer);

    //void notifyAll();
    void notifyAllObs();

}
