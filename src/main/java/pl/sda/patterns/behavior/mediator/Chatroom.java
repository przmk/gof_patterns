package pl.sda.patterns.behavior.mediator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Chatroom {
    private Map<String, User> participants = new HashMap<>();
    public void register(User user){
        user.setChatroom(this);
        participants.put(user.getName(), user);
    }
    public void send(User from, String to, String message) {
        User user = participants.get(to);
        user.notify(from.getName());
        user.receive(from.getName(), message);
    }
}
