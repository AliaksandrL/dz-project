package dz.zd10;

import java.util.Scanner;

/**
 * Created by sasha on 30.04.2017.
 *
 * @author sasha
 * @version 1.0
 * @since JDK 1.8
 */
public class zd10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int size = scanner.nextInt();
        int array[][] = new int[size][size];
        int counter = 0;

        for (int i = 0; i < size; i++) {
            for (int j = counter; j < size - counter; j++) {
                array[i][j] = 1;
            }
            counter++;
        }

        for (int i = 0; i < size; i++) {
            counter--;
            for (int j = counter; j < size - counter; j++) {
                array[i][j] = 1;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}





