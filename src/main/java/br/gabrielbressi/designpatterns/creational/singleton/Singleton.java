package br.gabrielbressi.designpatterns.creational.singleton;

public class Singleton {

    private static volatile Singleton instance;
    private String data;


    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                if (result == null){
                    instance = result = new Singleton(data);
                }
            }
        }

        return instance;
    }


}
