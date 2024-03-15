package br.gabrielbressi.designpatterns.behavioral.observer.example03.classes;

import br.gabrielbressi.designpatterns.behavioral.observer.example03.IObserver;

public class Feed implements IObserver {

    private String channelId;
    private String url;

    public Feed(String channelId) {
        this.channelId = channelId;
        this.url = "https://www.youtube.com/feeds/videos.xml?channel_id=" + channelId;
    }

    @Override
    public void update(Video video) {
        System.out.printf("New video added in Feed: %s\n", video.getTitle());
        System.out.printf("Check this out: %s\n", this.url);
    }
}
