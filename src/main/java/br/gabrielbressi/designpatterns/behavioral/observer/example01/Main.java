package br.gabrielbressi.designpatterns.behavioral.observer.example01;

import br.gabrielbressi.designpatterns.behavioral.observer.example01.classes.Event;
import br.gabrielbressi.designpatterns.behavioral.observer.example01.classes.MobileAppListener;
import br.gabrielbressi.designpatterns.behavioral.observer.example01.classes.EmailMsgListener;
import br.gabrielbressi.designpatterns.behavioral.observer.example01.classes.Store;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();

        store.getNotificationService().subscribe(
                Event.NEW_ITEM,
                new EmailMsgListener("example@email.com")
        );

        store.getNotificationService().subscribe(
                Event.NEW_ITEM,
                new EmailMsgListener("example@gmail.com")
        );

        store.getNotificationService().subscribe(
                Event.SALE,
                new MobileAppListener("Example")
        );
    }

}
