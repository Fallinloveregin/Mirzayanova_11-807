
import java.util.Scanner;

public class HW502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] arr = s.toCharArray();
        s = "";
        for (int i =0; i < arr.length; i++) {
            if (arr[i] > 48 && arr[i] <= 57) {
                arr[i] = '*';
                 }
                 s = s + arr[i];
            }
            System.out.println(s);
        }
    })