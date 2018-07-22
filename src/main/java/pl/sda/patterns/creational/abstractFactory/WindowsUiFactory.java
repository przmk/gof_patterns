package pl.sda.patterns.creational.abstractFactory;

class WindowsUiFactory implements UiAbstractFactory {
    public Button getButton() {
        return new WindowsButton();
    }

    public Input getInput() {
        return new WindowsInput();
    }
}
