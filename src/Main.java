import java.util.Scanner;
import java.time.Year;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите ваш возраст: ");
        int age = scanner.nextInt();
        int curentYear = 2026;
        int birthYearSimple = curentYear - age;
        System.out.println("Поздравляю, вы родились в "+birthYearSimple+" году");
scanner.close();

    }
}
