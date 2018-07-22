package pl.sda.patterns.structural.bridge;

class ShortView implements View {
    private final Resource resource;

    ShortView(Resource resource) {
        this.resource = resource;
    }


    @Override
    public void show() {
        System.out.println(resource.getHeader());
        System.out.println(resource.getImage());
    }
}
