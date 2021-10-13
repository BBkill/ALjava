public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        Sneak sneak = new Sneak();
        Bird bird= new Bird();
        dog.setWeight(20);
        dog.eat();
        dog.run();
        dog.makeSound();
        System.out.println("adults dogs often weigh: "+ dog.getWeight());
        System.out.println();
        sneak.eat();
        sneak.crawl();
        sneak.makeSound();
        System.out.println();
        bird.eat();
        bird.fly();
        bird.makeSound();

    }
}
