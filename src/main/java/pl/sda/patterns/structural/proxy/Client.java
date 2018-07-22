package pl.sda.patterns.structural.proxy;

class Client {
    private final Basket basket;

    Client(Basket basket) {
        this.basket = basket;
    }
    public void doActions(){
        basket.addProduct(new Product("szampon"));
        basket.addProduct(new Product("suszarke"));
        basket.addProduct(new Product("piwo"));
        basket.addProduct(new Product("piwo"));
        basket.removeProduct(new Product("piwo"));
        basket.removeProduct(new Product("piwo"));
    }
}
