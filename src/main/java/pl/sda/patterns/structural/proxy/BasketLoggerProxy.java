package pl.sda.patterns.structural.proxy;

import java.util.List;

class BasketLoggerProxy implements Basket{
    private final RealBasket realBasket;

    BasketLoggerProxy(RealBasket realBasket) {
        this.realBasket = realBasket;
    }

    @Override
    public void addProduct(Product product) {
        realBasket.addProduct(product);
    }

    @Override
    public void removeProduct(Product product) {
        System.out.println("Uzytkownik usunal produkt: " + product);
        realBasket.removeProduct(product);
    }

    @Override
    public List<Product> getProducts() {
        return realBasket.getProducts();
    }
}
