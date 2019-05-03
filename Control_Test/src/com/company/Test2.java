package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

    public class Test2<T> { //храним все элементы в эрэйлисте
        private List<T> АList = new ArrayList<>();

        public void add(T obj) { //добавляет элемент  в список
            АList.add(obj);
        }

        public void addall(List<T> objects) { //добавляет в список все элементы из другой коллекции
            АList.addAll(objects);
        }

        public List<T> TOP(int N, Comparator<T> comparator) { //пользуемся стрим апи и сортируем список по компоратору
            return АList.stream().sorted(comparator).limit(N).collect(Collectors.toList());
        }

        public List<T> top10(Comparator<T> comparator) {
            return TOP(10, comparator);
        }
    }

