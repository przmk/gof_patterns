package pl.sda.patterns.behavior.observer;

class ObserverMain {
    public static void main(String[] args) {
        RegisterUser registerUser = new RegisterUser();
        registerUser.registerObservers(new ActivationEmailSender());
//        registerUser.registerObservers(new PrepareFirstPlaylist());
        registerUser.register(new User("przemke","pz@gmail.com"));
    }
}
