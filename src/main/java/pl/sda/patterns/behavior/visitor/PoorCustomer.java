package pl.sda.patterns.behavior.visitor;

class PoorCustomer implements Customer {
    private String name;

    public PoorCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void accept(Taxi taxi) {
        taxi.handleCustomer(this);
    }
}
