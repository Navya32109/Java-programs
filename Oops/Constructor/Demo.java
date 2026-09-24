package Constructor;
public class Demo {
    public static void main(String[] args) {
        class Animal {
            void sound() {
                System.out.println("The animal makes sound");
            }
        }
        class Dog extends Animal {
            @Override
            void sound() {
                System.out.println("dog is barking");
            }
        }
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.sound();
        dog.sound();
    }
}