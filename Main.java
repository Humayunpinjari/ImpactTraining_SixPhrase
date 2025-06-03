import java.util.*;

class Animal {
    public void move() {
        System.out.println("Animal moves");
    }
}

class Cheetah extends Animal {
    public void move() {
        System.out.println("Cheetah is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal anime = new Animal();
        anime.move();

        Cheetah cheetah = new Cheetah();
        cheetah.move();
    }
}
