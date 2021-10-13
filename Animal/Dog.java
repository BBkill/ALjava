public class Dog extends Animals implements Actions {
    Dog(){};
    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }
    @Override
    public void move() {
        System.out.println("dogs run by four legs");
    }
    @Override
    public void eat() {
        System.out.println("dogs eat lots of food per day");
    }
    @Override
    public void makeSound() {
        System.out.println("dogs sound go go go");
    }
    @Override
    public int getWeight() {
        return super.getWeight();
    }
}
