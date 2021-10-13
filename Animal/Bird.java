public class Bird extends Animals implements Actions {
    Bird(){}
    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }
    @Override
    public void move() {
        System.out.println("birds fly hight in the sky");
    }
    @Override
    public void eat() {
        System.out.println("birds eat nut, or smaller insect or fish");
    }
    @Override
    public void makeSound() {
        System.out.println("birds sound chip chip chip");
    }
    @Override
    public int getWeight() {
        return super.getWeight();
    }
}
