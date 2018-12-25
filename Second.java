import java.rmi.NotBoundException;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("n");
        int n = sc.nextInt();
        System.out.println("x");
        int x = sc.nextInt();
        System.out.println("y");
        int y = sc.nextInt();
        System.out.println("элементы матрицы");
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(sameInt(x, y, matrix));

    }

    public static boolean sameInt(int x, int y, int[][] matrix) {
        try {
            if (matrix[x][y] == matrix[x + 1][y] || matrix[x][y] == matrix[x][y + 1] || matrix[x][y] == matrix[x - 1][y] || matrix[x][y] == matrix[x][y - 1] ||
                    matrix[x][y] == matrix[x + 1][y + 1] || matrix[x][y] == matrix[x - 1][y - 1] || matrix[x][y] == matrix[x + 1][y - 1] || matrix[x][y] == matrix[x - 1][y + 1]) {
                return true;
            }
        } catch (IndexOutOfBoundsException e) {

                System.out.println("выход за рамки массива");
        }
        return false;
    }
}







