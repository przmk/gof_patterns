package pl.sda.patterns.structural.bridge;

class AlbumResource implements Resource{
    private String title;
    private String albumPicture;
    private String listOfSongs;
    private String publisher;

    public AlbumResource(String title, String albumPicture, String listOfSongs, String publisher) {
        this.title = title;
        this.albumPicture = albumPicture;
        this.listOfSongs = listOfSongs;
        this.publisher = publisher;
    }

    @Override
    public String getHeader() {
        return this.title;
    }

    @Override
    public String getImage() {
        return this.albumPicture;
    }

    @Override
    public String getContent() {
        return this.listOfSongs;
    }

    @Override
    public String getFooter() {
        return this.publisher;
    }
}
