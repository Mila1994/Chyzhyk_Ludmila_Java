import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            int num = 0;
            try {
                num = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число");
            }
            if (num > 7) {
                System.out.println("Привет");
            }
            else{
                System.out.println("Число не больше 7");
            }
        }
    }
}

