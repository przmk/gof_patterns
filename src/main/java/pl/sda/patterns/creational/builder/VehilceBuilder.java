package pl.sda.patterns.creational.builder;

interface VehilceBuilder {
    VehilceBuilder addWheel();
    VehilceBuilder setTank(int size);
    Vehicle build();
}
