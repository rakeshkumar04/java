package OOPs;
public class ZooManagement {

    public static void main(String[] args) {
        
        Animal lion = new Lion("Mufasa");
        Animal monkey = new Monkey("Kong");
        Animal elephant = new Elephant("Beast");

        
        playSounds(lion);
        playSounds(monkey);
        playSounds(elephant);
    }

    static void playSounds(Animal animal) {
        System.out.println(animal.getName() + ": " + animal.makeSound());
    }
}

class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    String makeSound() {
        return "Hello";
    }
}

class Lion extends Animal {

    Lion(String name) {
        super(name);
    }

    //@Override
    String makeSound() {
        return "Roar!";
    }
}

class Monkey extends Animal {

    Monkey(String name) {
        super(name);
    }

    //@Override
    String makeSound() {
        return "Chatter!";
    }
}

class Elephant extends Animal {

    Elephant(String name) {
        super(name);
    }

    //@Override
    String makeSound() {
        return "Trumpet!";
    }
}
