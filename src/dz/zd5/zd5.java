package dz.zd5;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by sasha on 11.05.2017.
 * <p>
 * We find the smallest common multiple and the greatest common divisor of numbers.
 *
 * @author sasha
 * @version 1.0
 * @since JDK 1.8
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

    /**
     * This method calculate the least common multiple of the entered numbers.
     *
     * @param number1 an integer contains the entered number by the user.
     * @param number2 an integer contains the entered number by the user.
     * @return the least common multiple of the entered numbers.
     */
    public static void nod(int number1, int number2, int n) { //Находим наименьшее общее кратное.
        n = number1 % number2;
        number1 = number2;
        number2 = n;
        if (n > 0)
            nod(number1, number2, n);
        else
            System.out.println("Нод равен: " + number1);

    }

    /**
     * This method calculate the greatest common divisor of the entered numbers.
     *
     * @param number1 an integer contains the entered number by the user.
     * @param number2 an integer contains the entered number by the user.
     * @return the greatest common divisor of the entered numbers.
     */
    public static void nok(int number1, int number2, int n) { //Находим наибольший общий делитель.
        for (int i = 1; i <= number1 * number2; i++) {
            if ((i % number1 == 0) && (i % number2 == 0)) {
                System.out.println("НОК равен: " + i);
                return;
            }
        }

    }
}
