import java.util.Scanner;

public class ThreadReader extends Thread{

    @Override
    public void run() {
        Scanner scanner = new Scanner("Files/text1.txt");
        while(scanner.hasNextLine() ){
            ThreadWriter tw = new ThreadWriter(scanner.nextLine());
            tw.start();
        }
    }
}