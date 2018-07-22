package pl.sda.patterns.behavior.command;

class TurnOnLight implements Command{
    private final Light light;

    TurnOnLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("turn on light");
        light.turnOn();
    }
}
