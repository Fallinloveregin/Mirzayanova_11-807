import java.util.ArrayList;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = 10;
        for (int i = 0; i < 20; i++) {
            arrayList.add(10+n);
            n = n +1 ;
        }

        Collections.sort(arrayList);
        System.out.println("сначала маленькие,потом побольше" + arrayList);
        arrayList.sort((o1, o2) -> { //вот это лямда ыыыы
            int x = o1;
            int y = o2;
            return Integer.compare(y, x);
        });
        System.out.println(" сначала большинькие,потом поменьше" + arrayList);
    }
}

