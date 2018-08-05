package pl.sda.patterns.behavior.visitor;

class Taxi {


    void handleCustomer(PoorCustomer customer) {
        System.out.println("zaplaci 10 zl");
    }

    void handleCustomer(RichCustomer customer) {
        System.out.println("zaplaci 300 zl");
    }

}
