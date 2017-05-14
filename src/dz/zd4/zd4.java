package dz.zd4;

import java.util.Scanner;

/**
 * Created calculator by sasha on 11.05.2017.
 *
 * @author sasha
 * @version 1.0
 * @since JDK 1.8
 */
public class zd4 {
    public static void main(String[] args)
            throws java.io.IOException {

        Scanner enter = new Scanner(System.in);
        char operation;
        double num1, num2, result;

        System.out.println("Введите первое число: ");
        num1 = enter.nextDouble();

        System.out.println("Выбери операцию над числом (+,-,/,*):  ");
        operation = (char) System.in.read();

        System.out.println("Введи второе число: ");
        num2 = enter.nextDouble();

        switch (operation) {
            case ('+'):
                result = sum(num1, num2);
                System.out.println("Ответ равен:" + result);
                break;
            case ('-'):
                result = min(num1, num2);
                System.out.println("Ответ равен:" + result);
                break;
            case ('*'):
                result = umn(num1, num2);
                System.out.println("Ответ равен:" + result);
                break;
            case ('/'):
                result = del(num1, num2);
                System.out.println("Ответ равен:" + result);
                break;
            default:
                System.out.println("Не известная операция!");
                break;
        }


    }

    /**
     * We created methods for calculating each separate operation of the calculator.
     * @return the sum of entered numbers.
     */

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double min(double num1, double num2) {
        return num1 - num2;
    }

    public static double umn(double num1, double num2) {
        return num1 * num2;
    }

    public static double del(double num1, double num2) {
        return num1 / num2;
    }
}

