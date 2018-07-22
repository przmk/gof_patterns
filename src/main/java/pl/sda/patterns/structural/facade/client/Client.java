package pl.sda.patterns.structural.facade.client;

import pl.sda.patterns.structural.facade.Facade;

class Client {
    public static void main(String[] args) {
        Facade  facade = new Facade();
        String s = facade.showProject("Marzenia", "iphone", "macbook pro", "porshe");
        System.out.println(s);

    }
}
