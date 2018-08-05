package pl.sda.patterns.behavior.mediator;

class User {
    private String name;
    private Chatroom chatroom;

    public String getName() {
        return name;
    }

    public void setChatroom(Chatroom chatroom) {
        this.chatroom = chatroom;
    }

    public User(String name) {
        this.name = name;
    }

    public void send(String to, String message) {
        chatroom.send(this, to, message);
    }

    public void receive(String from, String message) {
        System.out.println(name + "dostal wiadomosc od "+ from +": " +message);
    }

    public void notify(String from){
        System.out.println(name + " ma wiadomosc od "+ from);
    }
}
