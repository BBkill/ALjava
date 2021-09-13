import java.util.Scanner;
import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // truyen vao 3 canh cua tam giac
        double[] angle = new double[3];
        for (int i = 0; i < 3; i++) {
            angle[i] = input.nextDouble();
        }
        Arrays.sort(angle); // tiền xử lý

        // phân loại tam giac
        if (angle[0] <= 0)
            System.out.println("Khong phai tam giac");
        else if (angle[0] + angle[1] > angle[2] && angle[0] + angle[2] > angle[1] && angle[2] + angle[1] > angle[0]) {
            if (isoscelesTriangle(angle) && rightTriangle(angle))
                System.out.println("Day la tam giac vuong can");
            else if (equilateralTriangle(angle))
                System.out.println("Day la ta giac deu");
            else if (isoscelesTriangle(angle))
                System.out.println("Day la tam giac can");
            else if (rightTriangle(angle))
                System.out.println("Day la tam giac  vuong");
            else
                System.out.println("Day la tam giac thuong");
        } else
            System.out.println("Khong phai tam giac");
    }

    // check tam giac vuong
    public static boolean rightTriangle(double angle[]) {
        if (Math.sqrt(angle[0] * angle[0] + angle[1] * angle[1]) == angle[2])
            return true;
        return false;
    }

    // check tam giac deu
    public static boolean equilateralTriangle(double angle[]) {
        if (angle[0] == angle[1] && angle[1] == angle[2])
            return true;
        return false;
    }

    // check tam giac can
    public static boolean isoscelesTriangle(double angle[]) {
        if (angle[0] == angle[1])
            return true;
        return false;
    }

}