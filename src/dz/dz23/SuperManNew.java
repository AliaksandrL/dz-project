package dz.dz23;

import dz.dz22.SuperMan;

/**
 * Created by Sasha on 20.05.2017.
 *
 * @author Sasha
 * @version 1.0
 * @return result, this variable includes all symbols from the String variable.
 * @since JDK 1.8
 * <p>
 * In these constructors, we declare variables to work with them.
 */
public class SuperManNew extends SuperMan {
    public SuperManNew(String firstName, String lastName, double telNamber, String superpower) {
        super(firstName, lastName, telNamber, superpower);
    }

    @Override
    public boolean equals(Object obj) {
        SuperManNew second = (SuperManNew) obj;
        return this.superpower == second.superpower;
    }
}
