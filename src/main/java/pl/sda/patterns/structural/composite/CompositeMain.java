package pl.sda.patterns.structural.composite;

class CompositeMain {
    public static void main(String[] args) {
        Project project = new Project("main");

        project.addTodo(new Todo("kup jajka"));

        project.addTodo(new Todo("kup mleko"));

        Project homework = new Project("praca domowa");
        homework.addTodo(new Todo("zadanie 1"));
        homework.addTodo(new Todo("zadanie 2"));
        project.addTodo(homework);

        project.addTodo(new Todo("kup chleb"));

        System.out.println(project.getContent());
    }
}
