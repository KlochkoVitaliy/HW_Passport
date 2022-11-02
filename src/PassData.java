import java.util.HashSet;
import java.util.Set;

public class PassData {
    private final Set<Passport> passData = new HashSet<>();

    public void addPassport(Passport p) {
        if (passData.add(p)) {
            return;
        } else {
            for (Passport pass : passData) {
                if (pass.getNumber().equals(p.getNumber())) {
                    pass.setBornDate(p.getBornDate().toString());
                    pass.setSurname(p.getSurname());
                    pass.setName(p.getName());
                    pass.setMidName(p.getMidName());
                }
            }
        }
    }
    public Passport getPassport(String number) {
        for (Passport passport : passData) {
            if (passport.getNumber().equals(number)) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        for (Passport passport : passData) {
            sb.append(passport.toString()).append('\n');
        }
        return sb.toString();
    }
}