public class Sneak extends Animals  {
    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }
    
    public void crawl() {
        System.out.println("sneak don't have a leg, they crawl");
    }
    
    public void eat() {
        System.out.println("sneaks often eat mouses");
    }
    
    public void makeSound() {
        System.out.println("sneaks pretty quiet, they rarely make sound");
    }
    
    public int getWeight() {
        return super.getWeight();
    }
}
