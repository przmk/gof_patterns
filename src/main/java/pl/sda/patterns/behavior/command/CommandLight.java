package pl.sda.patterns.behavior.command;

class CommandLight {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteController remoteController = new RemoteController(light);
        remoteController.clickButton1();
        remoteController.clickButton2();
        remoteController.setButton1(new TurnOffLight(light));
        remoteController.clickButton1();
        remoteController.clickButton2();
    }
}
