package services.png.zoo;

public class Main {

    public static void main(String[] args) {
        boolean t = true;
        boolean f = false;
        boolean b = 5 < 6;
        boolean b1 = t && f; //t und f ist false
        boolean b2 = t || f; //t oder f ist true



        Animal[] pets2 = new Animal[2];

        pets2[0] = new Cat("Katze1");
        pets2[1] = new Dog("Bello");

        pets2[1].makeSound();


        Animal[] pets = {
                new Cat("Katze1"),
                new Dog("Bello")
        };

        Human philipp = new Human("Philipp", pets2);
        philipp.play();


    }
}
