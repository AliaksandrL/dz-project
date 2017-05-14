package Interfaces;

/**
 * Created by andrei on 30.04.2017.
 *
 * @author sasha
 * @version 1.0
 * @since JDK 1.8
 */
public class Main1 {
    public static void Hello(){
        System.out.println("HELLO");
    }


    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int array[][] = new int[size][size];
//        zd10 butterfly = new zd10();
//
//        butterfly.getUpperWing(array);
//        butterfly.getBottomWing(array);
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                System.out.print(array[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}


//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число: ");
//    int size = scanner.nextInt();
//     = new int[size][size];
//    int counter = 0;
//int array[][]
//        for (int i = 0; i < size; i++) {
//        for (int j = counter; j < size - counter; j++) {
//            array[i][j] = 1;
//        }
//        counter++;
//    }
//
//        for (int i = 0; i < size; i++) {
//        counter--;
//        for (int j = counter; j < size - counter; j++) {
//            array[i][j] = 1;
//        }
//    }
//
//        for (int i = 0; i < size; i++) {
//        for (int j = 0; j < size; j++) {
//            System.out.print(array[i][j]);
//        }
//        System.out.println();
//    }


        MyClass myObject1;

        myObject1=new MyClass(3,5);
        System.out.println(myObject1.Sum());
        myObject1.Number2=2;
        myObject1.Number1=5;
        System.out.println(myObject1.Sum());

        myObject1.Number2=8;
        myObject1.Number1=10;
        System.out.println(myObject1.Sum());



        myObject1=new MyClass(100);
        System.out.println(myObject1.Sum());
        myObject1.Number2=3;
        myObject1.Number1=5;
        System.out.println(myObject1.Sum());

        myObject1.Number2=9;
        myObject1.Number1=10;
        System.out.println(myObject1.Sum());

        System.out.println("=============================");

        MyClass array[] = new MyClass[10];
        for(int i=0; i<array.length; i++)
        {
            array[i]=new MyClass();
        }

        for(int i=0; i<array.length; i++)
        {
            array[i].Number1=i;
            array[i].Number2=i+1;
            System.out.println(array[i].Sum());
        }
    }


}





