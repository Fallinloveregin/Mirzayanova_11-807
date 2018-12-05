public interface IntList {
    //возвращает количество элементов
    int size();

    //возвращает true, если такой элемент есть в списке
    boolean contains(int element);//work

    //добавляет новый элемент в конец списка
    void add(int e);//work

    //возвращает элемент по индексу
    int get(int index);//work

    //удаляет элемент по индексу
    void remove(int index);//work

    //сортирует элементы по возрастанию
    void sort();//work

    //добавляет в конец все элементы из данного списка
    void addAll(IntList intList);//я вам не гений,сори

    //добавляет в данный список все элементы из данного списка
    //начиная со startPosition
    void addAll(IntList intList, int startPosition);//а че так сложно

    //возвращает содержимое списка в виде массива
    int[] toArray();//че то не ворк

    //возвращает индекс первого вхождения элемента с данным значением
    int indexOf(int value);//work
    //собсна это наш итератор те патерн!!!!!!
    //Iterator iterator();
}
