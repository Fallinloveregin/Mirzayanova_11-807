import java.util.Scanner;

public class HW802 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int maxSumString = Integer.MIN_VALUE;//мининмальное целочисленное значение инта
        int maxSumColm = Integer.MIN_VALUE;
        int indexString = 0;
        int indexColm = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > maxSumString) {
                maxSumString = sum;
                indexString = i;
            }
        }

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            if (sum > maxSumColm) {
                maxSumColm = sum;
                indexColm = i;
            }
        }
        for (int j = 0; j <m; j++) {
            System.out.print(arr[indexString][j] + " ");

        }
        System.out.println();
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i][indexColm] + " ");

        }
    }
}
