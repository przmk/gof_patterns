package pl.sda.patterns.creational.singleton;

import com.sun.javafx.runtime.eula.Eula;

class SingletonMain {
    public static void main(String[] args) {
        EagerSingleton instance = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        System.out.println(instance == instance2);
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        String value = instance1.getValue();
    }
}
