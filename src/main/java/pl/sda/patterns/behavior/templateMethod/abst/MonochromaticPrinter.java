package pl.sda.patterns.behavior.templateMethod.abst;

class MonochromaticPrinter extends Printer {


    @Override
    void getInk() {
        System.out.println("zaladowany czarny tusz");
    }

    @Override
    void loadPaper() {
        System.out.println("pobrana kartka A4");

    }

    @Override
    void prepareDocument() {
        System.out.println("zmieniono kolory obrazu na wersje czarnobiala");
    }

    @Override
    void printDocument() {
        System.out.println("zaczeto drukowac");
    }
}
