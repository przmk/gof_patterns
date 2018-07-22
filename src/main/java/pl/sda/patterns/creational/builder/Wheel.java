package pl.sda.patterns.creational.builder;

class Wheel {
    private final int size;

    Wheel(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Wheel{");
        sb.append("size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
