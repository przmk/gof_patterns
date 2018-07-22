package pl.sda.patterns.behavior.command;

class TurnOffLight implements Command {
    private final Light light;

    TurnOffLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("turn off light");

        light.turnOff();
    }
}
