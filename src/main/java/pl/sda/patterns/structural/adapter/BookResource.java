package pl.sda.patterns.structural.adapter;

class BookResource implements ResourceProduct{
    private final Book book;

    BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String getPicture() {
        return book.frontPicture();
    }

    @Override
    public String getContent() {
        return book.bio();
    }
}
