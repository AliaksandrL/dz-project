package Interfaces;

/**
 * Created by Администратор on 13.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        TwoNumbersOperation variable;

        variable = new My();
        System.out.println(variable.SomeOperation(1,3));

        variable = new My1();
        System.out.println(variable.SomeOperation(1,3));
    }
}
