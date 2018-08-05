package pl.sda.patterns.behavior.templateMethod.abst;

abstract class  Printer {

    abstract void getInk();
    abstract void loadPaper();
    abstract void prepareDocument();
    abstract void printDocument();
    void print(){
        prepareDocument();
        loadPaper();
        getInk();
        prepareDocument();
    }

}
