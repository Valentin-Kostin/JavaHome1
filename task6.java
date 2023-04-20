
// Вводится массив (сначала количество элементов, потом сами элементы).
// Найдите сумму его элементов с чётными индексами и выведите её. 
// А потом выведите числа, которые суммировались.
// Sample Input:
// 4
// 1
// 2
// 3
// 4
// Sample Output:
// 4
// 1
// 3
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Длина массива: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Введите %de число: ", i+1);
            int ni = Integer.parseInt(sc.nextLine());
            arr[i] = ni;
        }
        int sum = 0;
        for (int index = 1; index < arr.length; index+=2) {
            sum += arr[index];
        }
        System.out.println(sum);
        for (int index = 1; index < arr.length; index+=2) {
            System.out.printf("%d ", arr[index]);
        }
        sc.close();
        
    }
}
