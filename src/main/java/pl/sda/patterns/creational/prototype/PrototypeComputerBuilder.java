package pl.sda.patterns.creational.prototype;

class PrototypeComputerBuilder {
    private final static Computer prototype =
            new Computer("AMD",
                    64,
                    "62 cale");
    Computer getComputer(){
        return (Computer) prototype.clone();
    }
}
