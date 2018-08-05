package pl.sda.patterns.behavior.templateMethod.interf;

class MonochromaticPrinter implements Printer {


    @Override
    public void getInk() {
        System.out.println("zaladowany czarny tusz");
    }

    @Override
    public void loadPaper() {
        System.out.println("pobrana kartka A4");

    }

    @Override
    public void prepareDocument() {
        System.out.println("zmieniono kolory obrazu na wersje czarnobiala");
    }

    @Override
    public void printDocument() {
        System.out.println("zaczeto drukowac");
    }
}
