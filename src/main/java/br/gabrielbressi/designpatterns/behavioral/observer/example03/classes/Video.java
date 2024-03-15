package br.gabrielbressi.designpatterns.behavioral.observer.example03.classes;

public class Video {

    private String id;
    private String title;
    private String thumbnail;
    private String link;

    public Video(String id, String title, String thumbnail, String link) {
        this.id = id;
        this.title = title;
        this.thumbnail = thumbnail;
        this.link = link;
    }

    public String getId() {
        return id;
    }

    /**
     * setId shouldn't be public
     * */
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
