import java.util.*;

public class checkFibonaci {
    public static void main(String[] args) {

        // Generate fibonaci
        Set<Long> fibonaci = new HashSet<Long>();
        Long firstNumber = Long.valueOf(0);
        Long secondNumber = Long.valueOf(1);
        fibonaci.add(firstNumber);
        fibonaci.add(secondNumber);
        for (int i = 2; i < 100; i++) {
            Long thirdNumber = firstNumber + secondNumber;
            fibonaci.add(thirdNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }

        // check fibonaci number
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        if (fibonaci.contains(number)) {
            System.out.println("day la so fibonaci");
        } else {
            System.out.println("day khong la so fibonaci");
        }

    }
}