import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PassData {
    private Set<Passport> passport;

    public PassData() {
        passport = new HashSet<>();
    }

    public Set<Passport> getPassport() {
        return passport;
    }

    public void addPassport(Set<Passport> passport) {
        for (Passport pas : passport) {
            if (pas.equals(passport)) {
                passport = Collections.singleton(pas);
            }
        }
    }

    public void getByNumber(Set<Passport> passport) {
        for (Passport numberPas : passport) {
            if (numberPas.getNumberPassport() == numberPas.getNumberPassport()) {
                getPassport();

            }
        }
    }
}
