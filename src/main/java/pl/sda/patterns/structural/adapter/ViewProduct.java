package pl.sda.patterns.structural.adapter;

class ViewProduct {
    private final ResourceProduct resource;

    ViewProduct(ResourceProduct resource) {
        this.resource = resource;
    }

    void show(){
        System.out.println(resource.getPicture());
        System.out.println();
        System.out.println(resource.getContent());
    }
}
