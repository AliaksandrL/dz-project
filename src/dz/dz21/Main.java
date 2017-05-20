package dz.dz21;

/**
 * Created by Администратор on 20.05.2017.
 * @author Sasha
 * @version 1.0
 * @since JDK 1.8
 */
public class Main {
    public static void main(String[] args){
        Man man1 = new Man("Sasha", "Lipski", 11111111);
        Man man2 = new Man("John", "Lipski");
        Man man3 = new Man("Sara", 3333);


        System.out.println(man1);
        System.out.println(man2);
        System.out.println(man3);


    }
}
