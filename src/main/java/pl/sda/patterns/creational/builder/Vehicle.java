package pl.sda.patterns.creational.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Vehicle {
    private final int tankSize;
    private final List<Wheel> wheels;

    Vehicle(int tankSize, List<Wheel> wheels) {
        this.tankSize = tankSize;
        this.wheels = Collections.unmodifiableList(new ArrayList<>(wheels));
    }

    public int getTankSize() {
        return tankSize;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vehicle{");
        sb.append("tankSize=").append(tankSize);
        sb.append(", wheels=").append(wheels);
        sb.append('}');
        return sb.toString();
    }
}
