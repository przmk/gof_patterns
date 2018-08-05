package pl.sda.patterns.behavior.strategy;

class TransportApp {
    public static void main(String[] args) {
        TransportStrategy strategy = new CarTrasportStrategy();
        TransportService service = new TransportService(strategy);
        System.out.println("Time: "+service.getTime("bialystok", "warszawa"));
        System.out.println("Length: "+service.roadLength("bialystok", "warszawa"));
        service.setTransportStrategy(new TrainTransportStrategy());
        System.out.println("Time: "+service.getTime("bialystok", "warszawa"));
        System.out.println("Length: "+service.roadLength("bialystok", "warszawa"));

    }
}
