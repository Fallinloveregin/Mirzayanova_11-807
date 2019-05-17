package com.company;

import java.util.Random;

public class Main {
    public static long mainSum = 0;

    public static void main(String[] args) throws InterruptedException {
        //завести массив на ~1 000 000 элементов,
        //заполнить рандомно
        //завести n штук CounterThread'ов,
        //выделив каждому кусок массива,
        //сумму которого он считает
        //запустить каждый, дождаться окончания
        //работы всех тредов => получили сумму в
        //переменной mainSum
        //Для проверки прямо в main'e посчитайте
        //сумму обычным for'ом по всему массиву
        //сравните полученные результаты
        int n = 1000000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 2;
        }
        long simplesum = 0;
        for (int i = 0; i < n; i++) {
            simplesum += arr[i];
        }
        CounterThread first = new CounterThread(0,200000,arr);
        first.start();
        first.join();
        CounterThread second = new CounterThread(200000,400000,arr);
        second.start();
        CounterThread thread = new CounterThread(400000,800000,arr);
        thread.start();
        CounterThread fought = new CounterThread(800000,1000000,arr);
        fought.start();
        second.join();
        thread.join();
        fought.join();
        System.out.println(simplesum);
        System.out.println(mainSum);

    }
}
