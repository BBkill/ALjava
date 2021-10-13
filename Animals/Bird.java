public class Bird extends Animals{
    Bird(){}
    public void setWeight(int weight) {
        super.setWeight(weight);
    }
    public void fly() {
        System.out.println("birds fly hight in the sky");
    }
    public void eat() {
        System.out.println("birds eat nut, or smaller insect or fish");
    }
    public void makeSound() {
        System.out.println("birds sound chip chip chip");
    }
    public int getWeight() {
        return super.getWeight();
    }
}
