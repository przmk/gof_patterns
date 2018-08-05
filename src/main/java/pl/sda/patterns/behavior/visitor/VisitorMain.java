package pl.sda.patterns.behavior.visitor;

class VisitorMain {

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Customer customer = new PoorCustomer("Przemek");
        customer.accept(taxi);
    }
}
