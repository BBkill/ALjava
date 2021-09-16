import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ChosenedNumber {
    static final int limit = 1000000;

    public static void main(String[] args) throws FileNotFoundException {

        
        FileInputStream fileInputStream = new FileInputStream("D:/ALjava/BTB2(2)/Number.txt");//đọc file
        Scanner input = new Scanner(fileInputStream);
        String inputData[] = input.nextLine().trim().split("\\s+");//xử lý dữ liệu trong file (bỏ khoảng trắng thừa)
        //kiểm tra dữ liệu đầu vào
        for(int i=0;i<inputData.length;i++)
        {
            try {
                int result = Integer.parseInt(inputData[i]);
            } catch (NumberFormatException e) {
                System.out.println("Sai du lieu dau vao");
                return;
            }
        }
        Set<Integer> listNumber = new HashSet<>();
        int[] timeAppear = new int[limit];
        for (int i = 0; i < limit; i++)
            timeAppear[i] = 0;
        //xác định số lần lặp lại của các số đủ tiêu chuẩn
        for (int i = 0; i < inputData.length; i++) {
            int tmp = Integer.parseInt(inputData[i]);
            if (checkNumber(tmp)) {
                if (listNumber.contains(tmp))
                    timeAppear[tmp]++;
                else {
                    listNumber.add(tmp);
                    timeAppear[tmp] = 1;
                }
            }
        }
        for (int i = 0; i < limit; i++) {
            if (timeAppear[i] != 0) {
                System.out.println(i + " co: " + timeAppear[i] + " lan xuat hien");
            }
        }
        input.close();
    }
    //kiểm tra số nguyên tố
    public static boolean isPrime(int Number) {
        if (Number == 0 || Number == 1)
            return false;
        if (Number == 2)
            return true;
        for (int i = 2; i * i < Number; i++)
            if (Number % i == 0)
                return false;
        return true;
    }
    //kiểm tra số đủ yêu cầu
    public static boolean checkNumber(int Number) {
        while (Number > 0) {
            if (!isPrime(Number % 10))
            return false;
            Number/=10;
        }
        return true;
    }
}
