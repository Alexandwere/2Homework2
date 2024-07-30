package homework2;

public class Ex2 {
    public static void main(String[] args) {
        String name = "     ПЕтРов Олег Иванович     ";

        String newName = name.toUpperCase().trim();

        if (newName.contains("ОВА ")) {
            System.out.println("Уважаемая " + newName);
        } else if (newName.contains("ОВ ")) {
            System.out.println("Уважаемый " + newName);
        } else {
            System.out.println("Неизвестное лицо " + newName);
        }
    }
}
