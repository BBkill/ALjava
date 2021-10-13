public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Sneak sneak = new Sneak();
        Bird bird= new Bird();
        dog.setWeight(20);
        dog.eat();
        dog.move();
        dog.makeSound();
        System.out.println("adults dogs often weigh: "+ dog.getWeight());
        System.out.println();
        cat.setWeight(5);
        cat.eat();
        cat.move();
        cat.makeSound();
        System.out.println("adults cats often weigh: "+ cat.getWeight());
        System.out.println();
        sneak.eat();
        sneak.move();
        sneak.makeSound();
        System.out.println();
        bird.eat();
        bird.move();
        bird.makeSound();

    }
}
