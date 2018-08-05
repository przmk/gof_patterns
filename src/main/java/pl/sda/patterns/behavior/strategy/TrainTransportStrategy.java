package pl.sda.patterns.behavior.strategy;

class TrainTransportStrategy implements TransportStrategy {
    @Override
    public int getTime(String from, String to) {
        if ("bialystok".equals(from) && "warszawa".equals(to)){
            return 2;
        }
        return 4;
    }

    @Override
    public int roadLength(String from, String to) {
        if ("bialystok".equals(from) && "warszawa".equals(to)){
            return 150;
        }
        return 400;
    }
}
