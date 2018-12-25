import java.util.Scanner;

public class Fist {

        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int minEven = 0;
            int row;
            int [][] matrix = new int [n][n];
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                int count = 0;
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = sc.nextInt();
                    if (matrix[i][j] % 2 == 0) {
                        count++;
                    }
                }
                if (count < minEven) {
                    row = i;
                }
            }
            for (int j = 0; j < matrix.length; j++) {
                sum++;
            }
            System.out.println(sum);
        }
    }


