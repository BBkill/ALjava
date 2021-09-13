import java.util.*;
import java.math.BigInteger;

public class maxPowerr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // truyền vào 2 số n và x
        BigInteger numberN = new BigInteger(input.next());
        BigInteger numberX = new BigInteger(input.next());
        BigInteger factorialN = factorial(numberN);

        long numberY = 0;// số mũ
        while (factorialN.mod(numberX).equals(BigInteger.valueOf(0))) {
            numberY++;
            factorialN = factorialN.divide(numberX);
        }
        System.out.println(numberY);
    }

    // tính giai thừa của n
    public static BigInteger factorial(BigInteger number) {
        BigInteger result = BigInteger.valueOf(1);

        for (long factor = 2; factor <= number.longValue(); factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }
}
