package pl.sda.patterns.behavior.state;

class MetroApplication {
    public static void main(String[] args) {
        Gate gate = new Gate();
        gate.enter();
        gate.pay("3425456");
        gate.pay("342342");
        gate.enter();
        gate.pay("345456");
        gate.enter();
    }
}
