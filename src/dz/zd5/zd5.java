package dz.zd5;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
/**
 * Находим наименьшее общее кратное и наибольший общий делитель чисел.
 */
public class zd5 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        int number1, number2;
        int n = 1;

        System.out.println("Введите первое число: ");
        number1 = enter.nextInt();

        System.out.println("Введите второе число: ");
        number2 = enter.nextInt();

        nod(number1, number2, n);
        nok(number1, number2, n);

    }
   public static void nod (int number1, int number2, int n) { //Находим наименьшее общее кратное.
        n = number1 % number2;
        number1 = number2;
        number2 = n;
        if (n > 0)
            nod(number1, number2, n);
        else
            System.out.println("Нод равен: " + number1);

   }

    public static void nok(int number1, int number2, int n) { //Находим наибольший общий делитель.
        for (int i = 1; i <= number1 * number2; i++) {
            if ((i % number1 == 0) && (i % number2 == 0)) {
                System.out.println("НОК равен: " + i);
                return;
            }
        }

    }
}
