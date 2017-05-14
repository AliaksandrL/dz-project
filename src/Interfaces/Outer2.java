package Interfaces;

public class Outer2 {

    public void OuterPrint() {
        System.out.println("Hello from Outer class");
        InnerPrivateClass inner = new InnerPrivateClass();
        inner.InnerPrint();

        class LocalClass {
            public void LocalPrint() {
                System.out.println("Hello from Local class");
            }
        }

        LocalClass local = new LocalClass();
        local.LocalPrint();
    }


    private class InnerPrivateClass {
        public void InnerPrint() {
            System.out.println("Hello from Inner private class");
        }
    }

    public class InnerPublicClass {
        public void InnerPrint() {
            System.out.println("Hello from Inner public class");
        }
    }
}
