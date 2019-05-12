import java.awt.geom.Point2D;
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static final int number = 100; // кол-во наборов входных данных
    public static int count = 100; // длина входных данных
    public static final String inputFileName = "C:\\Users\\One\\Desktop\\TwoThreeTreeSort\\src\\main\\java\\Points.txt";
    public static String[] buf;
    public static long searchTime, insertTime, removeTime;

    public static void main(String[] args) throws IOException {
        TwoThreeTree tree = new TwoThreeTree();
        // генерация случайных входных данных
        PointCreater.generateRandomPoints(number, count);
        // очистка файлов, которые будут заполнятся в будущем
        PointCreater.clearFile();
        // берем 1 строку из файла, в котором входые данные
        FileInputStream fis = new FileInputStream(inputFileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fis));
        String line = bufferedReader.readLine();
        long finalTime = 0;
        while (line != null) { // пока не закончатся строки в файле
            // определяю кол-во входных чисел
            buf = line.split(" ");
            // массив для множества всех точек.
            int[] points = new int[buf.length];
            for (int i = 0; i < buf.length; i++) {
                // присваиваю в каждую ячейку массива число
                tree.insert(Integer.parseInt(buf[i]));
            }
            removeTime = countRemoveTime(tree, points.length);
            insertTime = countInsertTime(tree, points.length);
            searchTime = countSearchTime(tree, points.length);
            PointCreater.recordDatainFile(points, searchTime, removeTime, insertTime);
            // считывается следующая строка
            line = bufferedReader.readLine();
            // обнуляю все значения перед следующим циклом
            for (int i = 0; i < buf.length ; i++) {
                tree.remove(0);
            }
        }
    }


    public static long countRemoveTime(TwoThreeTree tree, int size) {
        long startTime, finalTime, endTime;
        startTime = System.nanoTime();
        tree.remove(0 + (int) (Math.random() * size));
        endTime = System.nanoTime();
        finalTime = ((endTime - startTime));
        return  finalTime;
    }

    public static long countInsertTime(TwoThreeTree tree, int size) {
        long startTime, finalTime, endTime;
        startTime = System.nanoTime();
        tree.insert(0 + (int) (Math.random() * size));
        endTime = System.nanoTime();
        finalTime = ((endTime - startTime));
        return  finalTime;
    }

    public static long countSearchTime(TwoThreeTree tree, int size) {
        long startTime, finalTime, endTime;
        startTime = System.nanoTime();
        tree.search(0 + (int) (Math.random() * size));
        endTime = System.nanoTime();
        finalTime = ((endTime - startTime));
        return  finalTime;
    }
}