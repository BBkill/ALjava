import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int m = input.nextInt();
            int[][] Matrix = new int[n][m];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                {
                    Matrix[i][j] = input.nextInt();
                }
            }
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    int tmp = 0;
                    for(int k = 0; k < m; k++)
                    {
                        tmp += Matrix[i][k] * Matrix[j][k];
                    }
                    System.out.print(tmp + " ");
                }
                System.out.println();
            }
        }
}
