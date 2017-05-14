package dz.zd6;

/**
 * Created by sasha on 11.05.2017.
 * We swap the values ​​of the variable, supported by xor.
 *
 * @author sasha
 * @version 1.0
 * @since JDK 1.8
 */
public class zd6 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        a ^= (b ^= a);
        b ^= a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
