public class Main {

    public static void main(String[] args) {
        IntList list = new IntArrayList();
        list.add(42);
        list.add(45);
        list.add(41);
        list.add(47);
        IntList lis2 = new IntArrayList();
        for (int i = 0; i < 10; i++) {

            lis2.add(i);
        }
        list.addAll(lis2);
        System.out.println(list.get(3));
    }

        }








