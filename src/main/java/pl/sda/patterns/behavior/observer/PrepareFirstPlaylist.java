package pl.sda.patterns.behavior.observer;

class PrepareFirstPlaylist implements Observer{
    @Override
    public void update(User user) {
        Playlist playlist = new Playlist();
        playlist.getSongs().add("Bieber - Baby");
        playlist.setCreator(user);
        System.out.println("stworzono playliste: ");
        System.out.println(playlist);
    }
}
