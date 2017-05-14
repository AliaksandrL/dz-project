package dz.zd7;


/**
 * Created by andrei on 25.04.2017.
 *
 * @author sasha
 * @version 1.0
 * @since JDK 1.8
 */
public class Operation {
    /**
     * This method shifts bits to the left.
     *
     * @param x an integer contains the entered number by the user.
     * @return the shifted value of param x.
     */
    int makeShiftLeft(int x) {
        x = x << 1;
        return x;
    }

    /**
     * This method shifts bits to the right.
     *
     * @param x an integer contains the entered number by the user.
     * @return the shifted value of param x.
     */
    int makeShiftRight(int x) {
        x = x >> 1;
        return x;
    }

    /**
     * This method shifts bits to the right with preservation of the sign.
     *
     * @param x an integer contains the entered number by the user.
     * @return the shifted value of param x.
     */
    int makeLongShiftRight(int x) {
        x = x >>> 1;
        return x;
    }
}
