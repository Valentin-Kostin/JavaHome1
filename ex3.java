
// Реализовать простой калькулятор
// Минимум -- > Условия + Цикл
// Введите число
// Введите число
// Выберите операцию
// 1 - сложить
// 2 - умножить
// 3 - вычесть
// 4 - разделить
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        double nun_1 = sc.nextInt();
        System.out.printf("Введите второе число: ");
        double nun_2 = sc.nextInt();
        System.out.printf("Введите знак (1 -> +) (2 -> *) (3 -> -) (4 -> /)): ");
        int znak = sc.nextInt();
        double res;
        switch (znak) {
            case 1:
                res = nun_1 + nun_2;
                System.out.println("Результат: " + res);
                break;
            case 2:
                res = nun_1 * nun_2;
                System.out.println("Результат: " + res);
                break;
            case 3:
                res = nun_1 - nun_2;
                System.out.println("Результат: " + res);
                break;
            case 4:
                res = nun_1 / nun_2;
                System.out.println("Результат: " + res);
                break;
        }
        sc.close();
    }
}
