import java.util.Scanner;

public class HW503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку");
        String s = sc.next();
        char [] arr = s.toCharArray();
        int r = 0;
        for (int i = 0; i < arr.length ; i++){
            r = r * 10 + arr[i]-48;
        }
        System.out.println(r);
        }
    }
