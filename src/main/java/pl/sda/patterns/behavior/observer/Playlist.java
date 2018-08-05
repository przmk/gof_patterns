package pl.sda.patterns.behavior.observer;

import java.util.ArrayList;
import java.util.List;

class Playlist {
    private List<String> songs = new ArrayList<>();
    private User user;

    public List<String> getSongs() {
        return songs;
    }

    public void setCreator(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Playlist{");
        sb.append("songs=").append(songs);
        sb.append(", user=").append(user);
        sb.append('}');
        return sb.toString();
    }
}
