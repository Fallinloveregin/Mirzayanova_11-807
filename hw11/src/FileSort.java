import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSort {
    public static void main(String[] args) throws FileNotFoundException {
        int len = length();
        for (int i = 0; i < len; i++) {
            sort(i);
            merge();
        }
    }

    static void merge() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("src/in.txt"));//обьект класса который пишет v файл
        char a = 'a';
        Scanner[] scanners = new Scanner[26];
        for (int i = 0; i < 26; i++) {
            scanners[i] = new Scanner(new File("out" + a + ".txt"));
            a++;
        }
        for (int i = 0; i < 26; i++) {
            while (scanners[i].hasNext()) {//если есть значение в файле
                pw.println(scanners[i].next());
            }
        }
        pw.close();
    }

    static void sort(int k) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/in.txt"));
        PrintWriter[] pws = new PrintWriter[26];
        char a = 'a';
        for (int i = 0; i < 26; i++) {
            pws[i] = new PrintWriter(new File("out" + a + ".txt"));//прикрутили к файлу массив
            a++;
        }
        while (sc.hasNext()) { //есть следующее значение
            String s = sc.next();
            char c = s.charAt(0);
            pws[c - 'a'].println(s);//получаем порядковый номер нашего символа в алфавите
        }
        for (int i = 0; i < 26; i++) {
            pws[i].close();
        }
    }

    static int length() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/in.txt"));
        int max = 0;
        while (sc.hasNext()) {//пока есть значения
            String s = sc.next();
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }
}