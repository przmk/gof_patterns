package pl.sda.patterns.creational.prototype;

class Computer implements Cloneable{
    private final String precessorType;
    private final Integer memorySize;
    private final String screen;

    Computer(String precessorType, Integer memorySize, String screen) {
        this.precessorType = precessorType;
        this.memorySize = memorySize;
        this.screen = screen;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public String getPrecessorType() {
        return precessorType;
    }

    public String getScreen() {
        return screen;
    }

    @Override
    protected Object clone()  {
        return new Computer(precessorType, memorySize, screen);
    }
}
