class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat quarrels.");
    }
}


public class ClassNameExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();

        printClassName(animal);
        printClassName(cat);
    }

    public static void printClassName(Object o) {
        Class<?> name = o.getClass();
        String className = name.getSimpleName();
        System.out.println("Class name is " + className);
    }
}
