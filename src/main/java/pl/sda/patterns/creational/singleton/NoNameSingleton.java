package pl.sda.patterns.creational.singleton;

class NoNameSingleton {
    private final String value;

    private static class Singleton {
         private static final NoNameSingleton INSTANCE =
                 new NoNameSingleton();
    }
    private NoNameSingleton(){
        this.value = "jakas wartosc";
    }
    public static NoNameSingleton getInstance(){
        return Singleton.INSTANCE;
    }
}
