package pl.sda.patterns.behavior.templateMethod.interf;

class PrinterProgram {
    public static void main(String[] args) {
        Printer printer = new MonochromaticPrinter();
        printer.print();
    }
}
