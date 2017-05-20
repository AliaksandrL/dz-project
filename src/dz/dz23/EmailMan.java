package dz.dz23;

import dz.dz21.Man;

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
public class EmailMan extends Man {
    private String email;

    public EmailMan(String firstName, String lastName, String email) {
        super(firstName, lastName);
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        EmailMan second = (EmailMan) obj;
        return this.email == second.email;
    }

    @Override
    public String toString() {
        return super.toString() + " Email: " + this.email;
    }
}
