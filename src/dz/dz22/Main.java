package dz.dz22;

import java.util.logging.StreamHandler;

/**
 * Created by Администратор on 20.05.2017.
 *
 * @author Sasha
 * @version 1.0
 * @since JDK 1.8
 */
public class Main {
    public static void main(String[] args) {
        SuperMan man = new SuperMan("Sasha", "Lipski", 1234567, "wizard");
        SuperMan man1 = new SuperMan("Evgen", "Pupkin", "blueman");

        System.out.println(man);
        System.out.println(man1);
    }
}
