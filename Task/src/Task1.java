import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("enter how much numbers in row and column");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        int[] array = vvod();
        for (int i = 0; i < n; i++) {
            int dlinna = 0;
            int peremennaya = array[i];
            while (peremennaya != 0) {
                array[i] /= 10;
                dlinna++;
            }//нашли длинну каждого элемента массива
        }
        for (int s = 0; s < array.length; s++) {
            //алгоритм таков - циклом идем по матрице и по очереди проверяем строки, столбцы и диагонали на наличие числа и числа задом наперед.
            //мы нашли длинну элемента каждого массива ,берем первую цифру из числа и вертим в 8 направлениях,ищем сходство
            //дорешаю дома,скину,слишком сложно,прошу понять и простить

        }


    }

}


    public static int[] vvod() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }


}


