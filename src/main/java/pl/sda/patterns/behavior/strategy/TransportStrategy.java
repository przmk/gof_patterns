package pl.sda.patterns.behavior.strategy;

interface TransportStrategy {
    int getTime(String from, String to);

    int roadLength(String from, String to);
}
