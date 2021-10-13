public class Cat extends Animals implements Actions {
    public Cat(){}
    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }
    @Override
    public void move() {
        System.out.println("cats run by four legs");
    }
    @Override
    public void eat() {
        System.out.println("cats love eating fish");
    }
    @Override
    public void makeSound() {
        System.out.println("cat sound nyan nyan");
    }
    @Override
    public int getWeight() {
        return super.getWeight();
    }
}
