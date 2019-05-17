package com.company.brackets.linked_stack;

public class MyStack<T> {
   Uzel head;

   public void push(T value) {
       Uzel uzel = new Uzel();//создали обьект типа узел
       uzel.value = value;//в поле типа value положили переменную которую вызвали!
       uzel.next = head;
       head = uzel;
   }
   public T pop() {
       Uzel last = head;
       head = head.next;
       return (T) last.value;
   }
   public boolean isEmpty () {
       if (head == null) {
           return true;
       }
       return false;
   }



}
