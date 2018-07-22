package pl.sda.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

class AmericanVehicleBuilder implements VehilceBuilder{
    private List<Wheel > wheels = new ArrayList<>();
    private int tankSize;

    public VehilceBuilder addWheel() {
        wheels.add(new Wheel(27));
        return this;
    }

    public VehilceBuilder setTank(int size) {
        tankSize = size;
        return this;
    }

    public Vehicle build() {
        return new Vehicle(tankSize, wheels);
    }
}
