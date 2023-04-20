
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("n: ");
        String f = sc.nextLine();
        int n = Integer.parseInt(f);
        int rec_tre = treug_num(n);
        System.out.println(rec_tre);
        int rec_fac = factor(n);
        System.out.println(rec_fac);
        sc.close();

    }

    static int treug_num(int n) {
        if (n == 1)
            return 1;
        return n + treug_num(n - 1);
    }
    static int factor(int n){
        if (n==1) return 1;
        return n*factor(n-1);     
    }
}
