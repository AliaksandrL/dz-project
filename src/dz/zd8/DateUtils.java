package dz.zd8;

import java.util.Scanner;

/**
 * Created by Sasha on 13.05.2017.
 * @author sasha
 * @version 1.0
 * @since JDK 1.8
 */
public class DateUtils {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        String words = convertNumberToWords(number);
        System.out.println(words);
    }

    private static String[] sotni =
            {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    private static String[] desyatki =
            {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяноста"};
    private static String[] edinicy =
            {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
    /**
     * This method separates the digits.
     *
     * @return compares to an array.
     */
    public static String convertNumberToWords(int num) {
        int sotnya = num / 100;
        int desyatok = (num % 100) / 10;
        int edinica = num % 100 % 10;
        return sotni[sotnya] + " " + desyatki[desyatok] + " " + edinicy[edinica];
    }
}
