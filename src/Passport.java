import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Passport {
    private final String name;
    private final String firstName;
    private final String secName;
    private final int dateOfBirthday;

    private int numberPassport;

    public Passport(String name, String firstName, String secName, int dateOfBirthday, int numberPassport) {
        this.name = name;
        this.firstName = firstName;
        this.secName = secName;
        this.dateOfBirthday = dateOfBirthday;
        this.numberPassport = numberPassport;
    }

       public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecName() {
        return secName;
    }

    public int getDateOfBirthday() {
        return dateOfBirthday;
    }

    public int getNumberPassport() {
        return numberPassport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return dateOfBirthday == passport.dateOfBirthday && Objects.equals(name, passport.name) && Objects.equals(firstName, passport.firstName) && Objects.equals(secName, passport.secName) && Objects.equals(numberPassport, passport.numberPassport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstName, secName, dateOfBirthday, numberPassport);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secName='" + secName + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                ", numberPassport=" + numberPassport +
                '}';
    }
}
