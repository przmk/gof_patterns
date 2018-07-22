package pl.sda.patterns.creational.singleton;

enum EnumSingleton {
    INSTANCE("jakas wartosc");
    private final String value;

    EnumSingleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
