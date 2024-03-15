package br.gabrielbressi.designpatterns.behavioral.observer.example02;

import br.gabrielbressi.designpatterns.behavioral.observer.example02.classes.Observer;
import br.gabrielbressi.designpatterns.behavioral.observer.example02.classes.Subject;

public class Main {

    public static void main(String[] args) {
        Observer observerOne = new Observer(1);
        Observer observerTwo = new Observer(2);
        Observer observerThree = new Observer(3);

        Subject subject = new Subject();

        subject.subscribe(observerOne);
        subject.subscribe(observerTwo);
        subject.subscribe(observerThree);
        subject.notifyAllObs();


    }

}
