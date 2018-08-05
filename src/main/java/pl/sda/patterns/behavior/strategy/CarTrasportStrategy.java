package pl.sda.patterns.behavior.strategy;

class CarTrasportStrategy implements TransportStrategy {
    @Override
    public int getTime(String from, String to) {
        if ("bialystok".equals(from) && "warszawa".equals(to)){
            return 3;
        }
        return 5;
    }

    @Override
    public int roadLength(String from, String to) {
        if ("bialystok".equals(from) && "warszawa".equals(to)){
            return 210;
        }
        return 500;
    }
}
