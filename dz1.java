package sem4;

import java.util.LinkedList;

/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. */

public class dz1 {
    public static void main(String[] args) {
        String[] ar = new String[]{"one", "two", "three", "four", "five"};
        LinkedList<String> lList = new LinkedList<>();
        for (String item : ar) {
            lList.add(item);
        }
        System.out.println("исходный LinkedList: ");
        System.out.println(lList.toString());
        System.out.println("перевернутый LinkedList: ");
        System.out.println(ReversedList(lList));
    }
    
    static LinkedList<String> ReversedList(LinkedList<String> lList) {
        LinkedList<String> newLList = new LinkedList<>();
        for (String item : lList) {
            newLList.add(0, item);
        }
        return newLList;
    }
}
