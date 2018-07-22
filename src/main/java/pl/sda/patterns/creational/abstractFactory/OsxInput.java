package pl.sda.patterns.creational.abstractFactory;

class OsxInput implements Input {
    private String text;
    public void write(String value) {
        text = value;
    }

    public String getText() {
        return text;
    }
}
