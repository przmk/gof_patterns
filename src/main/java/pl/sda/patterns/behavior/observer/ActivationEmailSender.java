package pl.sda.patterns.behavior.observer;

class ActivationEmailSender implements Observer {
    @Override
    public void update(User user) {
        System.out.println("wyslano email aktywacyjny do uzytkownika "+user.getEmail());
    }
}
