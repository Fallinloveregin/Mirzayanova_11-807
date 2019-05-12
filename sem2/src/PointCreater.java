import java.awt.geom.Point2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PointCreater {

    public static final String inputFileName = "C:\\Users\\One\\Desktop\\TwoThreeTreeSort\\src\\main\\java\\Points.txt";
    public static final String outputData = "C:\\Users\\One\\Desktop\\TwoThreeTreeSort\\src\\main\\java\\Data.txt";
    public static final String removeTime = "C:\\Users\\One\\Desktop\\TwoThreeTreeSort\\src\\main\\java\\removeTime.txt";
    public static final String insertTime ="C:\\Users\\One\\Desktop\\TwoThreeTreeSort\\src\\main\\java\\insertTime.txt";
    public static final String searchTime = "C:\\Users\\One\\Desktop\\TwoThreeTreeSort\\src\\main\\java\\searchTime.txt";


    public static void generateRandomPoints(int number, int count) {
        try {
            FileWriter writer = new FileWriter(new File(inputFileName));
            int min = 0;
            int max = 10000;
            String newLine = System.getProperty("line.separator"); // перенос на новую строку
            for (int i = 0; i < number; i++) { // кол-во наборов входных данных
                for (int p = 0; p < 5; p++) { // кол-во повторов одинаковых входных данных
                    for (int j = 0; j < count; j++) { // длинна входных данных
                        writer.write(Integer.toString(ThreadLocalRandom.current().nextInt(min, max))); // запись в файл x
                        writer.write(" ");
                    }
                    writer.append(newLine);
                }
                count = count + 100;
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


   /* public static void recordPointsInFile(ArrayList<Point2D> index) { // вывод точек МВО
        try {
            FileWriter writer = new FileWriter(outputFileName, true);
            String newLine = System.getProperty("line.separator");
            for (int j = 0; j < index.size() - 1; j++) {
                writer.write(("(" + Integer.toString((int) index.get(j).getX())) + "; ");
                writer.write(Integer.toString((int) index.get(j).getY()) + ") ");
            }
            writer.append(newLine);
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }*/

    public static void clearFile() throws FileNotFoundException { // очистка файлов
        try {
            FileWriter fw = new FileWriter(outputData);
            fw.write("");
            fw.close();
            FileWriter fw1 = new FileWriter(insertTime);
            fw1.write("");
            fw1.close();
            FileWriter fw2 = new FileWriter(searchTime);
            fw2.write("");
            fw2.close();
            FileWriter fw3 = new FileWriter(removeTime);
            fw3.write("");
            fw3.close();
        } catch (Exception e) {
            System.err.println("Error in file cleaning: " + e.getMessage());
        }
    }

    public static void recordDatainFile(int[] points, long searchTimee, long removeTimee, long insertTimee) { // запись проих данных в файлы
        try {
            FileWriter writer = new FileWriter(outputData, true);
            String newLine = System.getProperty("line.separator");
            writer.write(points.length + newLine);
            writer.close();
            FileWriter writer1 = new FileWriter(removeTime, true);
            writer1.write(removeTimee + newLine);
            writer1.close();
            FileWriter writer2 = new FileWriter(searchTime, true);
            writer2.write(searchTimee + newLine);
            writer2.close();
            FileWriter writer3 = new FileWriter(insertTime, true);
            writer3.write(insertTimee + newLine);
            writer3.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
