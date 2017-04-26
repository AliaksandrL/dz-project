import java.util.Scanner;
/** Программа введет подсчет среднего балла студентов.
 *
 */
public class test {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        int kolvo, counter, ocenka;
        counter = 0;
        double suuma = 0;
        System.out.println("Введи количество студентов: ");
        kolvo = enter.nextInt();
        while (counter < kolvo) {
            counter ++;
            System.out.print("Введи оценку" + counter + "студента:");
            ocenka = enter.nextInt();
            if (ocenka <=10 && ocenka > 0){
                suuma += ocenka;
            }
        }
        System.out.println("Средний балл равен:" + suuma/kolvo);
    }
}
