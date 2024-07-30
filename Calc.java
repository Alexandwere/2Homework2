package homework2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        Double number1 = scanner.nextDouble();
        System.out.println("Введите знак операции - \"+\",  \"-\", \"*\", \"/\"");
        String operation = scanner.next();
        System.out.println("Введите второе число");
        Double number2 = scanner.nextDouble();

        if (operation.equals("+")) {
            System.out.println("Ответ: " + (number1 + number2));
        } else if (operation.equals("-")) {
            System.out.println("Ответ: "+ (number1 - number2));
        } else if (operation.equals("*")) {
            System.out.println("Ответ: " + (number1 * number2));
        } else if (operation.equals("/")) {
            System.out.println("Ответ: " + (number1 / number2));
        } else {
            System.out.println("Ошибка");
        }
        scanner.close();
    }
}
