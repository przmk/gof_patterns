package pl.sda.patterns.behavior.state;

class OpenGateState implements GateState{
    @Override
    public void pay(String cardNumber) {
        System.out.println("Juz zaplaciles wczesniej");
    }

    @Override
    public boolean paymentOk() {
        System.out.println("platnosc zatwierdzona");
        return true;
    }


}
