package Passport;

import java.util.HashSet;
import java.util.Set;

public class PassportList {
    private final Set<Passport> passports = new HashSet<Passport>();

    public void addOrUpdate(Passport passport) {
        this.passports.add(passport);

    }

    public Passport fineByNumber(int number) {
        for (Passport passport : passports) {
            if (passport.getPassportNumber() == 0) {
                return passport;
            }
        }
        return null;
    }
}