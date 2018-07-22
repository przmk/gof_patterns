package pl.sda.patterns.creational.singleton;

class LazySingleton {
    private static LazySingleton INSTANCE;
    private final String value;

    private LazySingleton(){
        this.value = "jakas wartosc";
    }
    public LazySingleton getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
