public class Dog extends Animals {
    Dog(){};
    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }
    
    public void run() {
        System.out.println("dogs run by four legs");
    }
    public void eat() {
        System.out.println("dogs eat lots of food per day");
    }
    public void makeSound() {
        System.out.println("dogs sound go go go");
    }
    @Override
    public int getWeight() {
        return super.getWeight();
    }
}
