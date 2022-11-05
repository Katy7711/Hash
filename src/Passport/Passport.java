package Passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int passportNumber;
    private final String lastname;
    private final String name;
    private final String surname;
    private final LocalDate localDate;


    public Passport(int passportNumber, String lastname, String name, String surname, LocalDate localDate) {
        this.passportNumber = Math.max(passportNumber, 1);
        this.lastname = lastname;
        this.name = name;
        this.localDate = localDate;
        if (surname == null || surname.isBlank());
        surname = "Отчество не указано";
        this.surname = surname;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumber == passport.passportNumber && Objects.equals(lastname, passport.lastname) && Objects.equals(name, passport.name) && Objects.equals(surname, passport.surname) && Objects.equals(localDate, passport.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber, lastname, name, surname, localDate);
    }
}
