class Animal{

    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class UpcastingDownCasting {
    public static void main(String[] args) {

        /**
         * Upcasting
         */
        Animal a = (Animal) new Dog();
        a.makeSound();

        /**
         * Downcasting
         */
        Animal a1 = new Dog();
        Dog dog = (Dog) a1;
        dog.makeSound();
    }
}
