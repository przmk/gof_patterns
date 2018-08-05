package pl.sda.patterns.behavior.visitor;

class RichCustomer implements Customer {
    private String name;

    public RichCustomer(String name) {
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
