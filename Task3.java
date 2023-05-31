import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите числа через пробел ");
                String numbers = in.nextLine();
                String[] arayNum = numbers.split(" ");
                int[] num = new int[arayNum.length];
                for (int i = 0; i < arayNum.length; i++) {
                    num[i] = Integer.parseInt(arayNum[i]);
                }
                for (int i : num) {
                    if (i % 3 == 0 && i != 0) {
                        System.out.println(i);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Необходимо ввести только числа через пробел");
            }
        }
    }
}
