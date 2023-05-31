
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите имя: ");
             String name = in.nextLine();
            if (name.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
                System.exit(0);
            } else {
                System.out.println("Нет такого имени");
            }
        }
    }
}
