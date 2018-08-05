package pl.sda.patterns.behavior.state;

class Gate {

    private GateState gateState = new CloseGateState();

    public void pay( String creditCardNumber){
        gateState.pay(creditCardNumber);
        if (gateState.paymentOk()) {
            gateState = new OpenGateState();
        }
    }

    public boolean enter(){
        if (gateState.paymentOk()) {
            System.out.println("uzytkownik wszedl");
            gateState = new CloseGateState();
            return true;
        }
        System.out.println("bramka zamknieta");
        return false;
    }

}
