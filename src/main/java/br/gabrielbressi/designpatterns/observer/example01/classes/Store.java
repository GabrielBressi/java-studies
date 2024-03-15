package br.gabrielbressi.designpatterns.observer.example01.classes;

public class Store {

    private NotificationService notificationService;


    public Store() {
        notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notify();
    }


    public NotificationService getNotificationService() {
        return this.notificationService;
    }

}
