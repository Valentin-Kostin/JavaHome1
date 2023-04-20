// Дан список. Выведите те его элементы, которые встречаются в списке 
// только один раз. Элементы нужно выводить в том порядке, в котором 
// они встречаются в списке.
// Входные данные
// Вводится список чисел. Все числа списка находятся на одной строке.
// Выходные данные
// Выведите ответ на задачу.
// Sample Input:
// 6
// 1
// 2
// 2
// 3
// 3
// 3
// Sample Output:
// 1
import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Длина массива: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];        
        for (int i = 0; i < arr.length; i++) {            
            System.out.printf("Введите %de число: ", i+1);
            int ni = Integer.parseInt(sc.nextLine());
            arr[i] = ni;        
        }
        sc.close();
        int[] al = new int[arr.length];        
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {                
                if (arr[j]==arr[i]) {
                    count++;
                }
            }
            if (count==1) {
                al[i]=arr[i];                
                }
        }        
        for (int i : al) {
            System.out.printf("%d ", i);
        }
        
    }
}

