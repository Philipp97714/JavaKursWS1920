package services.png.zoo;

public class Human {
    private String name;
    private Animal pets[];

    public Human(String name, Animal pets[]) {
        this.name = name;
        this.pets = pets;
    }

    public void play() {
        for (Animal a:pets){
            System.out.println(a.getName()+" macht "+a.makeSound());
        }

    }
}
