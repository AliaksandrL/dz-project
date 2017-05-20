package dz.dz23;

/**
 * Created by Администратор on 20.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        EmailMan emaiMan1 = new EmailMan("John", "Smith", "aaa@ff.by");
        EmailMan emaiMan2 = new EmailMan("Kent", "Looser", "aaa@ff.by");
        System.out.println(emaiMan1);
        System.out.println(emaiMan2);
        System.out.println("Equality - " + emaiMan1.equals(emaiMan2));

        emaiMan1 = new EmailMan("John", "Smith", "aaa@ff.by");
        emaiMan2 = new EmailMan("Kent", "Looser", "bbb@ff.by");
        System.out.println(emaiMan1);
        System.out.println(emaiMan2);
        System.out.println("Equality - " + emaiMan1.equals(emaiMan2));

        System.out.println("*=================*");

        SuperManNew superMan1 = new SuperManNew("John", "Smith",111111, "aaa");
        SuperManNew superMan2 = new SuperManNew("Kent", "Looser",222222, "aad");
        System.out.println(superMan1);
        System.out.println(superMan2);
        System.out.println("Equality - " + superMan1.equals(superMan2));

        superMan1 = new SuperManNew("John", "Smith",111111, "ddd");
        superMan2 = new SuperManNew("Kent", "Looser",222222, "ddd");
        System.out.println(superMan1);
        System.out.println(superMan2);
        System.out.println("Equality - " + superMan1.equals(superMan2));


    }
}
