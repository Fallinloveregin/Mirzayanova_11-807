
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TextAnalyzer analyzer = new JacardTextAnalayzer();
        System.out.println("если хочешь,чтобы с консоли вводился текст,то напиши 1,если с файла,то 2");
        Scanner sc = new Scanner(System.in);
        int params = sc.nextInt();
        switch (params) {
            case 1:
                new ConsoleReader();
                break;
            case 2:
                new FileReader();
                break;
            default:
                System.err.println("Такого параметра нет");
                break;
        }
    }
}