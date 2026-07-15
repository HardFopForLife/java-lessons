import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Создаем таким образом сканер, "System.in" говорит: что сканируй внутри

        Scanner scanner = new Scanner(System.in);

        //Делаем красивое приветствие :)

        System.out.println("Приветствую! Давайте знакомится)");
        System.out.println("Введите ваш возраст (целое число): ");

        //Делаем проверку, если вводит число - "да", символ - "нет"

        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();

            //Блок проверок условий

            if (age < 0) {
                System.out.println("Возраст не может быть отрицательным)");
            } else if (age > 100) {
                System.out.println("Вы не волшебник!!! " + age + " Столько не живут)");
            } else {
                //Проверка жизненного цикла
                String stage;
                if (age <= 10) {
                    System.out.println("Как вы смогли вобще разобраться...");
                    stage = "Ребенок";
                } else if (age <= 17) {
                    System.out.println("Нетрудно наверное было, молодец!");
                    stage = "Подросток";
                } else if (age <= 40) {
                    System.out.println("Разве вас это может интересовать?)");
                    stage = "Взрослый";
                } else {
                    System.out.println("На даче провели интернет?)))");
                    stage = "Пенсионер";
                }

                System.out.println("Вам " + age + " лет(-года),\nВаш жизненный этап " + stage);
            }
        } else {
            //Если вместо цифр буквы
            System.out.println("Ошибка: Нужно ввести целое число, попробуйте снова(");
        }
        scanner.close();
        System.out.println("Программа завершена =)");
        System.out.println("ттт");

    }
}