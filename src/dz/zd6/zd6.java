package dz.zd6;

/**
 * Меняем местами значения переменной, опирацией xor.
 */
public class zd6 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        a^= (b ^= a);
        b^= a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
