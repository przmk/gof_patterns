package pl.sda.patterns.behavior.mediator;

class MediatorMain {
    public static void main(String[] args) {
        Chatroom chatroom = new Chatroom();
        User user1 = new User("Przemek");
        User user2 = new User("Magosia");
        User user3 = new User("Zosia");
        User user4 = new User("Franek");
        chatroom.register(user1);
        chatroom.register(user2);
        chatroom.register(user3);
        chatroom.register(user4);
        user1.send("Magosia","Czesc co tam?");
    }
}
