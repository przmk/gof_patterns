package pl.sda.patterns.behavior.state;

class CloseGateState implements  GateState {
    private boolean payment = false;

    @Override
    public void pay(String cardNumber) {
        if (cardNumber.startsWith("34")){
            System.out.println("platnosc przebiegla pomyslnie");
            payment = true;
        }else {
            System.out.println("bledny numer karty");
            payment = false;
        }
    }

    @Override
    public boolean paymentOk() {
        return payment;
    }


}
