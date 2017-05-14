package dz.zd7;

import java.util.Scanner;

/**
 * Created by sasha on 11.05.2017.
 * Work with shifts <<, >>, >>>.
 *
 * @author sasha
 * @version 1.0
 * @since JDK 1.8
 */

public class zd7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();

        System.out.println("Выберите действие: ");
        System.out.println("1 - Сдвиг влево << на 1 позицию");
        System.out.println("2 - Сдвиг вправо >> на 1 позицию");
        System.out.println("3 - Сдвиг вправо без учета знака >>> на 1 позицию");


            Operation operation = new Operation();
            int y = scanner.nextInt();

            switch (y) {
                case 1: {
                    x = operation.makeShiftLeft(x);
                    System.out.println(x);
                    break;
                }
                case 2: {
                    x = operation.makeShiftRight(x);
                    System.out.println(x);
                    break;
                }
                case 3: {
                    x = operation.makeLongShiftRight(x);
                    System.out.println(x);
                    break;
                }
                default:
                    System.out.println("Действие не найдено!");

            }
        }
    }

