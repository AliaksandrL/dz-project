package Interfaces;

public class Outer {
    private int PrivateNumber;
    public int PublicNumber;

    public String ToString() {
        InnerPublicClass innerPublic = new InnerPublicClass(10, 20);
        return "===OuterClass===\nPrivate Number: " + PrivateNumber + "; Public Number: " + PublicNumber +
                innerPublic.ToString();
    }

    public class InnerPublicClass {
        private int PrivateNumber;
        public int PublicNumber;

        public InnerPublicClass(int privateNum, int publicNum) {
            this.PrivateNumber = privateNum;
            this.PublicNumber = publicNum;
        }

        public String ToString() {
            return "\n\n===InnerPublicClass===\nPrivate Number: " + PrivateNumber + "; Public Number: " + PublicNumber;
        }

    }
}
