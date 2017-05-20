package dz.dz21;

/**
 * Created by Администратор on 20.05.2017.
 *
 * @author Sasha
 * @version 1.0
 * @since JDK 1.8
 */
public class Man {
    private String firstName;

    public String getFirstName() {
        if (this.firstName == null || this.firstName == "")
            return "<not specified>";
        return firstName;
    }

    private String lastName;

    public String getLastName() {
        if (this.lastName == null || this.lastName == "")
            return "<not specified>";
        return lastName;
    }

    private double telNamber;
    /**
     * In these constructors, we declare variables to work with them.
     *
     * @return result, this variable includes all symbols from the String variable.
     */

    public Man(String firstName, double telNamber) {
        this(firstName, null, telNamber);
    }

    public Man(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    public Man(String firstName, String lastName, double telNamber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNamber = telNamber;
    }

    @Override
    public String toString() {
        if (this.telNamber == 0)
            return String.format("%1$s %2$s tel: <not specified>", this.getFirstName(), this.getLastName());
            return String.format("%1$s %2$s tel: %3$1.0f", this.getFirstName(), this.getLastName(), this.telNamber);
    }
}

