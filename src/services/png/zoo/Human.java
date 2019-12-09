package services.png.zoo;

public class Human {
    private String name;
    private Animal pets[];

    public Human(String name, Animal pets[]) {
        this.name = name;
        this.pets = pets;
    }

    public void play() {
        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i].makeSound());
        }
    }
}
