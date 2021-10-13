public class Sneak extends Animals implements Actions {
    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }
    @Override
    public void move() {
        System.out.println("sneak don't have a leg, they crawl");
    }
    @Override
    public void eat() {
        System.out.println("sneaks often eat mouses");
    }
    @Override
    public void makeSound() {
        System.out.println("sneaks pretty quiet, they rarely make sound");
    }
    @Override
    public int getWeight() {
        return super.getWeight();
    }
}
