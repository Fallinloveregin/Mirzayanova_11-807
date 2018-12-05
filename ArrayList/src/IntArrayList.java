import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public IntArrayList() {
        elements = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean contains(int element) {
        for (int i = 0; i < elements.length; i++) {
            if (element == (elements[i])) {
                return true;
            }
            }
        return false;
        }
        @Override
        public void add ( int e){
            if (capacity == count) {
                grow();
            }
            elements[count++] = e;
        }

    private void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    @Override
    public int get(int index) { //
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        return elements[index];
    }

    @Override
    public void remove(int index) {
        int ARRAAAYLENHGT = elements.length;
        for (int j = index; j < ARRAAAYLENHGT - 1; j++) {
            elements[j] = elements[j + 1];
            ARRAAAYLENHGT--;
        }
    }

    @Override
    public void sort() {
    for (int i = elements.length-1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (elements[j] > elements[j + 1]) {
                    int PUSTAYAPEREMENNAYA = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = PUSTAYAPEREMENNAYA;
                }
            }
       }
}

    @Override
        public void addAll(IntList intList) {
            int newCapacity = intList.size();
            int[] newElements = new int[newCapacity];
            for (int i = 0; i < capacity; i++) {
                newElements[i] = elements[i];
                count++;
            }
            capacity = newCapacity;
            elements = newElements;

            for (int i = elements.length - 1; i < intList.size(); i++) {
                elements[i] = intList.get(i);
            }
        }
                


    @Override
    public void addAll(IntList intList, int startPosition) { //think about.........................
            for (int i = 0; i < intList.size(); i++) {
                if (startPosition >= count ||capacity == count) {
                    grow();
                }
                elements[startPosition] = intList.get(i);
                startPosition++;
            }
        }



    @Override
    public int[] toArray() {
        int[] ArrayOfElements = new int[elements.length] ;
        for (int i = 0; i < elements.length ; i++) {
            ArrayOfElements[i] = elements[i];

        }
        return ArrayOfElements;
    }

    @Override
    public int indexOf(int value) {
        for (int i = 0; i < elements.length; i++) {
            if (value == (elements[i])) {
                return i;
            }
        }
        return -1;
    }
   // public int next() {
        //      int val = elements[currentIndex];
        //   currentIndex++;
        // return val;
       // return elements[currentIndex++];
    }
    //}

