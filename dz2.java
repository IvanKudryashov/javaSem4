package sem4;

import java.util.LinkedList;
import java.util.Scanner;

/*Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя. */

public class dz2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        
        System.out.println(ll);
        enqueue(ll,addElement()); // Добавили новый элемент в конец очереди
        System.out.println("Новый список: " + ll); 
        System.out.println("Удалили первый элемент: " + dequeue(ll)); // Удалили первый элемент
        System.out.println("Новый список: " + ll);
        System.out.println("Вывели первый элемент: " + first(ll)); // Вывели первый элемент
    }

    public static int addElement(){ // Запращивает элемент от пользователя
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элемент, который надо добавить: ");
        int num = Integer.parseInt(sc.nextLine());
        return num;
    }

    public static void enqueue(LinkedList<Integer> ll, int num) {// Метод помещает элемент в конец очереди
        ll.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> ll) { // Метод возвращает первый элемент из очереди и удаляет его
        int num = ll.get(0);
        ll.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> ll) { // Метод возвращает первый элемент из очереди, не удаляя его
        int num = ll.get(0);
        return num;
    }
}
