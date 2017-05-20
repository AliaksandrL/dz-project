package dz.dz22;

import dz.dz21.Man;

/**
 * Created by Администратор on 20.05.2017.
 * @author Sasha
 * @version 1.0
 * @since JDK 1.8
 */
public class SuperMan extends Man {
    protected String superpower;
    /**
     * In these constructors, we declare variables to work with them.
     *
     * @return result, this variable includes all symbols from the String variable.
     */
    public SuperMan(String firstName, String lastName, String superpower) {
        super(firstName, lastName);
        this.superpower = superpower;
    }

    public SuperMan(String firstName, String lastName, double telNamber, String superpower) {
        super(firstName, lastName, telNamber);
        this.superpower = superpower;
    }

    @Override
    public String toString() {
        String result = super.toString() + " super power: " + this.superpower;
        return result;
    }
}
