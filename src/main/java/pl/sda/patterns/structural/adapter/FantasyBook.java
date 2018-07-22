package pl.sda.patterns.structural.adapter;

class FantasyBook implements Book {
    @Override
    public String bio() {
        return "biografia a";
    }

    @Override
    public String frontPicture() {
        return "Front of fantasy book";
    }
}
