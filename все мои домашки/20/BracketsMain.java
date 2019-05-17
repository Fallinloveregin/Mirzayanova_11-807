package com.company.brackets;

import java.util.Scanner;

public class BracketsMain {
    public static void main(String[] args) {
        //пример: {(2+5)*[(2+3)*4]+1}/7
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean correct = bracketsAreCorrect(s);
        System.out.println(correct);
    }

    /**
     * Возвращает true, если скобки в выражении расставлены корректно.
     */
    public static boolean bracketsAreCorrect(String s) {
        Stack stack = new Stack(10);
        char[] symbols = s.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            char c = symbols[i];
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); //добавляет в стек
            }
            if (c == ')' || c == '}' || c == ']') {
                char a = stack.pop(); //выдает последнее значение
                boolean check = a == '(' && c == ')' || a == '[' && c == ']' || a == '{' && c == '}';
                if (check != true) {
                    return false;
                }
            }


        }
        if (stack.isEmpty()) { //если стэк пустой,то эт тру
            return true;
        }
        return false;
    }

}
