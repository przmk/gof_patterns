package pl.sda.patterns.creational.builder;

class BuilderMain {
    public static void main(String[] args) {
        VehilceBuilder builder = new AmericanVehicleBuilder()
                .addWheel().addWheel().addWheel().setTank(24);
        Vehicle build = builder.build();
        Vehicle build1 = builder.addWheel().setTank(50).build();
        System.out.println(build);
        System.out.println(build1);
    }
}
