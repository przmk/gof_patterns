package pl.sda.patterns.behavior.state;

interface GateState {
    void pay(String cardNumber);
    boolean paymentOk();

}
