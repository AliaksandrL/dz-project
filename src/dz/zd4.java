import java.util.Scanner;
/** Создание калькулятора.
 *
 */
public class zd4 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        double fn, sn, result;
        System.out.println("Введите первое число: ");
        fn = enter.nextDouble();
        System.out.println("Введи второе число: ");
        sn = enter.nextDouble();

        result = fn + sn;
        System.out.println("Средний балл равен:" + result);

        }

    }

