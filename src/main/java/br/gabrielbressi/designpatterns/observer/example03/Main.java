package br.gabrielbressi.designpatterns.observer.example03;

import br.gabrielbressi.designpatterns.observer.example03.classes.Feed;
import br.gabrielbressi.designpatterns.observer.example03.classes.Subscriber;
import br.gabrielbressi.designpatterns.observer.example03.classes.Video;
import br.gabrielbressi.designpatterns.observer.example03.classes.VideoNotification;

public class Main {

    public static void main(String[] args) {
        Video video = new Video(
                "ioYkXh8NhKc",
                "Programe o Design Pattern que está em muitas tecnologias atuais! (Observer)",
                "thumbsnail",
                "https://www.youtube.com/watch?v=ioYkXh8NhKc"
        );

        VideoNotification videoNotification = new VideoNotification(video);

        // Observers
        Subscriber joao = new Subscriber(1, "Joao");
        Subscriber maria = new Subscriber(2, "Maria");
        Subscriber cleide = new Subscriber(2, "Cleide");

        Feed feedYoutube = new Feed("ioYkXh8NhKc");

        videoNotification.subscribe(joao);
        videoNotification.subscribe(maria);
        videoNotification.subscribe(cleide);
        videoNotification.subscribe(feedYoutube);

        System.out.println("Notificando Observers...");
        videoNotification.notifyAllObs();

        // Unsubscribe cleide
        System.out.println("Desinscrevendo cleide...");
        videoNotification.unsubscribe(cleide);

        System.out.println();
        videoNotification.notifyAllObs();
    }

}
