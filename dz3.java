package sem4;

import java.util.*;

public class dz3 {
    public static void main(String[] args) {
        LinkedList<Double> result = new LinkedList<>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            result.add(sc.nextDouble());
            sc.nextLine();

            while(true) {
                System.out.print("Выберите действие (+ - / *, C - для отмены): ");
                String action = sc.nextLine();
                
                if ("C".equals(action)) // Отмена последней операции
                    result.remove();
                else {
                    System.out.print("Введите второе число: ");
                    double num2 = sc.nextDouble();

                    mathematicAction(result, action, num2);
                    sc.nextLine();
                    }
                    
                System.out.println("Результат: " + result.getFirst());
            }
        }
    }

    // Фунция выбора математического действия

    public static void mathematicAction(LinkedList<Double> list, String action, double number) {
        switch (action) {
            case "+":
                list.add(0, list.getFirst() + number);
                break;         
            case "-":
                list.add(0, list.getFirst() - number);
                break;
            case "*":
                list.add(0, list.getFirst() * number);
                break;
            case "/":
                list.add(0, list.getFirst() / number);
                break;
            default:
                System.out.println("Некеорректный ввод!");
        }
    }
}
