package pl.sda.patterns.structural.decorator;

class DecoratorMain {
    public static void main(String[] args) {
        Viewable viewable = new Fine("Piles przed zajeciami z programowania");
        viewable = new Admonishment(viewable);
        viewable = new Admonishment(viewable);
        viewable.show();
    }
}
