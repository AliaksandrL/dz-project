package Interfaces;

/**
 * Created by Администратор on 13.05.2017.
 */
public class MyClass {
    public int Number1;
    public int Number2;
    private int Number3;

    public MyClass()
    {}

    public MyClass(int num1, int num2)
    {
        Number1=num1;
        Number2=num2;
    }


    public MyClass(int num)
    {
        Number3=num;
    }

    public int Sum() {
        class MySuperPrivate
        {

        }
        return Number1+Number2+Number3;
    }

    class MyPrivateClass
    {

    }
}
