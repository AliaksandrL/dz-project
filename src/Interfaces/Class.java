package Interfaces;

/**
 * Created by Администратор on 13.05.2017.
 */
public class Class {
    public static void main(String[] args) {
        // работа с вложенным классом

        System.out.println("=====Inner Private&Public Classes====");
        Outer2 outer = new Outer2();
        outer.OuterPrint();

        Outer2.InnerPublicClass innerPublicClass = new Outer2().new InnerPublicClass();
        innerPublicClass.InnerPrint();


        // работа с анонимным классом
        System.out.println("=====Anonimus Class====");
        Sportable sportmen = new Sportable() {
            @Override
            public void Swiming() {
                System.out.println("I am willing to swim!");
            }

            @Override
            public void Diving(int deepth) {
                System.out.println("I am willing to dive at "+deepth+" meters depth!");
            }
        };

        sportmen.Swiming();
        sportmen.Diving(20);

    }
}

